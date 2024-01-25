// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imagesearch20190325.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddImageResponseBody} extends {@link TeaModel}
 *
 * <p>AddImageResponseBody</p>
 */
public class AddImageResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("PicInfo")
    private PicInfo picInfo;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private AddImageResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.picInfo = builder.picInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddImageResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return picInfo
     */
    public PicInfo getPicInfo() {
        return this.picInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private PicInfo picInfo; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PicInfo.
         */
        public Builder picInfo(PicInfo picInfo) {
            this.picInfo = picInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public AddImageResponseBody build() {
            return new AddImageResponseBody(this);
        } 

    } 

    public static class PicInfo extends TeaModel {
        @NameInMap("CategoryId")
        private Integer categoryId;

        @NameInMap("Region")
        private String region;

        private PicInfo(Builder builder) {
            this.categoryId = builder.categoryId;
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PicInfo create() {
            return builder().build();
        }

        /**
         * @return categoryId
         */
        public Integer getCategoryId() {
            return this.categoryId;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        public static final class Builder {
            private Integer categoryId; 
            private String region; 

            /**
             * CategoryId.
             */
            public Builder categoryId(Integer categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            public PicInfo build() {
                return new PicInfo(this);
            } 

        } 

    }
}
