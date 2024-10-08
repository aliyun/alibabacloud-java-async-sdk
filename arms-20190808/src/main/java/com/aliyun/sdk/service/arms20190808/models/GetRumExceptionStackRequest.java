// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
            this.pid = request.pid;
            this.regionId = request.regionId;
            this.sourcemapType = request.sourcemapType;
        } 

        /**
         * The binary images, which represent all executable files loaded into the process address space when a crash occurs.
         */
        public Builder exceptionBinaryImages(String exceptionBinaryImages) {
            this.putQueryParameter("ExceptionBinaryImages", exceptionBinaryImages);
            this.exceptionBinaryImages = exceptionBinaryImages;
            return this;
        }

        /**
         * The exception stack information. Set the value to a JSON string. call_stack.info represents the stack information, call_stack.thread.name represents the thread name, and call_stack.thread.id represents the thread ID. This parameter is exactly the same as the exception.stack parameter in the logstore-rum Logstore of Simple Log Service.
         */
        public Builder exceptionStack(String exceptionStack) {
            this.putQueryParameter("ExceptionStack", exceptionStack);
            this.exceptionStack = exceptionStack;
            return this;
        }

        /**
         * The ID of the exception thread.
         */
        public Builder exceptionThreadId(String exceptionThreadId) {
            this.putQueryParameter("ExceptionThreadId", exceptionThreadId);
            this.exceptionThreadId = exceptionThreadId;
            return this;
        }

        /**
         * The application ID.
         */
        public Builder pid(String pid) {
            this.putQueryParameter("Pid", pid);
            this.pid = pid;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The file type. Valid values:
         * <p>
         * 
         * - source-map: SourceMap files
         * - mapping: symbol table files for Android
         * - dsym: dSYM files for iOS
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
