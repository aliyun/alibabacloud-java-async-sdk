// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetRumExceptionStackRequest} extends {@link RequestModel}
 *
 * <p>GetRumExceptionStackRequest</p>
 */
public class GetRumExceptionStackRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExceptionBinaryImages")
    private String exceptionBinaryImages;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExceptionStack")
    private String exceptionStack;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExceptionThreadId")
    private String exceptionThreadId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtraInfo")
    private String extraInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourcemapType")
    private String sourcemapType;

    private GetRumExceptionStackRequest(Builder builder) {
        super(builder);
        this.exceptionBinaryImages = builder.exceptionBinaryImages;
        this.exceptionStack = builder.exceptionStack;
        this.exceptionThreadId = builder.exceptionThreadId;
        this.extraInfo = builder.extraInfo;
        this.pid = builder.pid;
        this.regionId = builder.regionId;
        this.sourcemapType = builder.sourcemapType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRumExceptionStackRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return exceptionBinaryImages
     */
    public String getExceptionBinaryImages() {
        return this.exceptionBinaryImages;
    }

    /**
     * @return exceptionStack
     */
    public String getExceptionStack() {
        return this.exceptionStack;
    }

    /**
     * @return exceptionThreadId
     */
    public String getExceptionThreadId() {
        return this.exceptionThreadId;
    }

    /**
     * @return extraInfo
     */
    public String getExtraInfo() {
        return this.extraInfo;
    }

    /**
     * @return pid
     */
    public String getPid() {
        return this.pid;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sourcemapType
     */
    public String getSourcemapType() {
        return this.sourcemapType;
    }

    public static final class Builder extends Request.Builder<GetRumExceptionStackRequest, Builder> {
        private String exceptionBinaryImages; 
        private String exceptionStack; 
        private String exceptionThreadId; 
        private String extraInfo; 
        private String pid; 
        private String regionId; 
        private String sourcemapType; 

        private Builder() {
            super();
        } 

        private Builder(GetRumExceptionStackRequest request) {
            super(request);
            this.exceptionBinaryImages = request.exceptionBinaryImages;
            this.exceptionStack = request.exceptionStack;
            this.exceptionThreadId = request.exceptionThreadId;
            this.extraInfo = request.extraInfo;
            this.pid = request.pid;
            this.regionId = request.regionId;
            this.sourcemapType = request.sourcemapType;
        } 

        /**
         * <p>The binary images, which represent all executable files loaded into the process address space when a crash occurs.</p>
         * 
         * <strong>example:</strong>
         * <p>iOSDemo:arm64%3B1489F4D3-6DE2-300C-90E9-E1B869675351%3B0x0000000104064000\nAlibabaCloudRUM:arm64%3BAB7B3A8E-6CEE-325D-BCBB-8DA50E61804F%3B0x0000000106660000\nlibdispatch.dylib:arm</p>
         */
        public Builder exceptionBinaryImages(String exceptionBinaryImages) {
            this.putQueryParameter("ExceptionBinaryImages", exceptionBinaryImages);
            this.exceptionBinaryImages = exceptionBinaryImages;
            return this;
        }

        /**
         * <p>The exception stack information. Set the value to a JSON string. call_stack.info represents the stack information, call_stack.thread.name represents the thread name, and call_stack.thread.id represents the thread ID. This parameter is exactly the same as the exception.stack parameter in the logstore-rum Logstore of Simple Log Service.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         * {
         *     &quot;call_stack.info&quot;: &quot;libsystem_kernel.dylib  0x00000001f1ce9178 0x00000001f1ce8000 + 4472\r\nlibsystem_kernel.dylib  0x00000001f1ce8f10 0x00000001f1ce8000 + 3856\r\nlibsystem_kernel.dylib  0x00000001f1ced718 0x00000001f1ce8000 + 22296\r\nAlibabaCloudRUM  0x0000000106711af4 0x0000000106660000 + 727796\r\nlibsystem_pthread.dylib  0x00000002146744d4 0x0000000214672000 + 9428&quot;,
         *     &quot;call_stack.thread.name&quot;: &quot;#3 BRSCrash Exception Handler (Secondary)&quot;,
         *     &quot;call_stack.thread.id&quot;: &quot;16643&quot;
         *   }
         * ]</p>
         */
        public Builder exceptionStack(String exceptionStack) {
            this.putQueryParameter("ExceptionStack", exceptionStack);
            this.exceptionStack = exceptionStack;
            return this;
        }

        /**
         * <p>The ID of the exception thread.</p>
         * 
         * <strong>example:</strong>
         * <p>16643</p>
         */
        public Builder exceptionThreadId(String exceptionThreadId) {
            this.putQueryParameter("ExceptionThreadId", exceptionThreadId);
            this.exceptionThreadId = exceptionThreadId;
            return this;
        }

        /**
         * ExtraInfo.
         */
        public Builder extraInfo(String extraInfo) {
            this.putQueryParameter("ExtraInfo", extraInfo);
            this.extraInfo = extraInfo;
            return this;
        }

        /**
         * <p>The application ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>atxxxxzkcf@d8deedfa9bf****</p>
         */
        public Builder pid(String pid) {
            this.putQueryParameter("Pid", pid);
            this.pid = pid;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The file type. Valid values:</p>
         * <ul>
         * <li>source-map: SourceMap files</li>
         * <li>mapping: symbol table files for Android</li>
         * <li>dsym: dSYM files for iOS</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>source-map</p>
         */
        public Builder sourcemapType(String sourcemapType) {
            this.putQueryParameter("SourcemapType", sourcemapType);
            this.sourcemapType = sourcemapType;
            return this;
        }

        @Override
        public GetRumExceptionStackRequest build() {
            return new GetRumExceptionStackRequest(this);
        } 

    } 

}
