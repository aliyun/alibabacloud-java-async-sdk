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
    private String pid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceId")
    private String serviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourcemapType")
    private String sourcemapType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Workspace")
    private String workspace;

    private GetRumExceptionStackRequest(Builder builder) {
        super(builder);
        this.exceptionBinaryImages = builder.exceptionBinaryImages;
        this.exceptionStack = builder.exceptionStack;
        this.exceptionThreadId = builder.exceptionThreadId;
        this.extraInfo = builder.extraInfo;
        this.pid = builder.pid;
        this.regionId = builder.regionId;
        this.serviceId = builder.serviceId;
        this.sourcemapType = builder.sourcemapType;
        this.workspace = builder.workspace;
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
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return sourcemapType
     */
    public String getSourcemapType() {
        return this.sourcemapType;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<GetRumExceptionStackRequest, Builder> {
        private String exceptionBinaryImages; 
        private String exceptionStack; 
        private String exceptionThreadId; 
        private String extraInfo; 
        private String pid; 
        private String regionId; 
        private String serviceId; 
        private String sourcemapType; 
        private String workspace; 

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
            this.serviceId = request.serviceId;
            this.sourcemapType = request.sourcemapType;
            this.workspace = request.workspace;
        } 

        /**
         * <p>The binary images, which represent all executable files loaded into the process address space at the time of the crash.</p>
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
         * <p>The error stack information in JSON list format. Each list element contains three fields: call_stack.info, call_stack.thread.name, and call_stack.thread.id, which represent the stack information, thread name, and thread ID, respectively. This is identical to the exception.stack field in the Simple Log Service logstore-rum.</p>
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
         * <p>The exception thread ID.</p>
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
         * <p>The additional system symbol table information for iOS parsing. This parameter is optional.</p>
         * 
         * <strong>example:</strong>
         * <p>GraphicsServices:system/GraphicsServices/85419099-269B-336D-86B4-0D52D0FF6923/GraphicsServices;WebCore:system/WebCore/BF44A3F4-85D4-38C8-BF26-197F06ADE273/WebCore</p>
         */
        public Builder extraInfo(String extraInfo) {
            this.putQueryParameter("ExtraInfo", extraInfo);
            this.extraInfo = extraInfo;
            return this;
        }

        /**
         * <p>The application ID.</p>
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
         * ServiceId.
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * <p>The parsing type. Valid values:</p>
         * <ul>
         * <li>js: JavaScript error parsing</li>
         * <li>sym: PC parsing</li>
         * <li>har: HarmonyOS parsing</li>
         * <li>dSYM: iOS parsing</li>
         * <li>so: Android parsing.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>js</p>
         */
        public Builder sourcemapType(String sourcemapType) {
            this.putQueryParameter("SourcemapType", sourcemapType);
            this.sourcemapType = sourcemapType;
            return this;
        }

        /**
         * Workspace.
         */
        public Builder workspace(String workspace) {
            this.putQueryParameter("Workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public GetRumExceptionStackRequest build() {
            return new GetRumExceptionStackRequest(this);
        } 

    } 

}
