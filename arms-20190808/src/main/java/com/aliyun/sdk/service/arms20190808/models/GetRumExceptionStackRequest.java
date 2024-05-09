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

    private GetRumExceptionStackRequest(Builder builder) {
        super(builder);
        this.exceptionBinaryImages = builder.exceptionBinaryImages;
        this.exceptionStack = builder.exceptionStack;
        this.exceptionThreadId = builder.exceptionThreadId;
        this.pid = builder.pid;
        this.regionId = builder.regionId;
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

    public static final class Builder extends Request.Builder<GetRumExceptionStackRequest, Builder> {
        private String exceptionBinaryImages; 
        private String exceptionStack; 
        private String exceptionThreadId; 
        private String pid; 
        private String regionId; 

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
        } 

        /**
         * ExceptionBinaryImages.
         */
        public Builder exceptionBinaryImages(String exceptionBinaryImages) {
            this.putQueryParameter("ExceptionBinaryImages", exceptionBinaryImages);
            this.exceptionBinaryImages = exceptionBinaryImages;
            return this;
        }

        /**
         * ExceptionStack.
         */
        public Builder exceptionStack(String exceptionStack) {
            this.putQueryParameter("ExceptionStack", exceptionStack);
            this.exceptionStack = exceptionStack;
            return this;
        }

        /**
         * ExceptionThreadId.
         */
        public Builder exceptionThreadId(String exceptionThreadId) {
            this.putQueryParameter("ExceptionThreadId", exceptionThreadId);
            this.exceptionThreadId = exceptionThreadId;
            return this;
        }

        /**
         * Pid.
         */
        public Builder pid(String pid) {
            this.putQueryParameter("Pid", pid);
            this.pid = pid;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetRumExceptionStackRequest build() {
            return new GetRumExceptionStackRequest(this);
        } 

    } 

}
