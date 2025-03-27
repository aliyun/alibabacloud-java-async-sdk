// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

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
 * {@link HotelQrBindResponseBody} extends {@link TeaModel}
 *
 * <p>HotelQrBindResponseBody</p>
 */
public class HotelQrBindResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("StatusCode")
    private Integer statusCode;

    private HotelQrBindResponseBody(Builder builder) {
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.statusCode = builder.statusCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HotelQrBindResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public static final class Builder {
        private String message; 
        private String requestId; 
        private Result result; 
        private Integer statusCode; 

        private Builder() {
        } 

        private Builder(HotelQrBindResponseBody model) {
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
            this.statusCode = model.statusCode;
        } 

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * StatusCode.
         */
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        public HotelQrBindResponseBody build() {
            return new HotelQrBindResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link HotelQrBindResponseBody} extends {@link TeaModel}
     *
     * <p>HotelQrBindResponseBody</p>
     */
    public static class OpenDeviceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EncodeKey")
        private String encodeKey;

        @com.aliyun.core.annotation.NameInMap("EncodeType")
        private String encodeType;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("IdType")
        private String idType;

        @com.aliyun.core.annotation.NameInMap("OrganizationId")
        private String organizationId;

        private OpenDeviceInfo(Builder builder) {
            this.encodeKey = builder.encodeKey;
            this.encodeType = builder.encodeType;
            this.id = builder.id;
            this.idType = builder.idType;
            this.organizationId = builder.organizationId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OpenDeviceInfo create() {
            return builder().build();
        }

        /**
         * @return encodeKey
         */
        public String getEncodeKey() {
            return this.encodeKey;
        }

        /**
         * @return encodeType
         */
        public String getEncodeType() {
            return this.encodeType;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return idType
         */
        public String getIdType() {
            return this.idType;
        }

        /**
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
        }

        public static final class Builder {
            private String encodeKey; 
            private String encodeType; 
            private String id; 
            private String idType; 
            private String organizationId; 

            private Builder() {
            } 

            private Builder(OpenDeviceInfo model) {
                this.encodeKey = model.encodeKey;
                this.encodeType = model.encodeType;
                this.id = model.id;
                this.idType = model.idType;
                this.organizationId = model.organizationId;
            } 

            /**
             * EncodeKey.
             */
            public Builder encodeKey(String encodeKey) {
                this.encodeKey = encodeKey;
                return this;
            }

            /**
             * EncodeType.
             */
            public Builder encodeType(String encodeType) {
                this.encodeType = encodeType;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * IdType.
             */
            public Builder idType(String idType) {
                this.idType = idType;
                return this;
            }

            /**
             * OrganizationId.
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
                return this;
            }

            public OpenDeviceInfo build() {
                return new OpenDeviceInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link HotelQrBindResponseBody} extends {@link TeaModel}
     *
     * <p>HotelQrBindResponseBody</p>
     */
    public static class OpenUserInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EncodeKey")
        private String encodeKey;

        @com.aliyun.core.annotation.NameInMap("EncodeType")
        private String encodeType;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("IdType")
        private String idType;

        @com.aliyun.core.annotation.NameInMap("OrganizationId")
        private String organizationId;

        private OpenUserInfo(Builder builder) {
            this.encodeKey = builder.encodeKey;
            this.encodeType = builder.encodeType;
            this.id = builder.id;
            this.idType = builder.idType;
            this.organizationId = builder.organizationId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OpenUserInfo create() {
            return builder().build();
        }

        /**
         * @return encodeKey
         */
        public String getEncodeKey() {
            return this.encodeKey;
        }

        /**
         * @return encodeType
         */
        public String getEncodeType() {
            return this.encodeType;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return idType
         */
        public String getIdType() {
            return this.idType;
        }

        /**
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
        }

        public static final class Builder {
            private String encodeKey; 
            private String encodeType; 
            private String id; 
            private String idType; 
            private String organizationId; 

            private Builder() {
            } 

            private Builder(OpenUserInfo model) {
                this.encodeKey = model.encodeKey;
                this.encodeType = model.encodeType;
                this.id = model.id;
                this.idType = model.idType;
                this.organizationId = model.organizationId;
            } 

            /**
             * EncodeKey.
             */
            public Builder encodeKey(String encodeKey) {
                this.encodeKey = encodeKey;
                return this;
            }

            /**
             * EncodeType.
             */
            public Builder encodeType(String encodeType) {
                this.encodeType = encodeType;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * IdType.
             */
            public Builder idType(String idType) {
                this.idType = idType;
                return this;
            }

            /**
             * OrganizationId.
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
                return this;
            }

            public OpenUserInfo build() {
                return new OpenUserInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link HotelQrBindResponseBody} extends {@link TeaModel}
     *
     * <p>HotelQrBindResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OpenDeviceInfo")
        private OpenDeviceInfo openDeviceInfo;

        @com.aliyun.core.annotation.NameInMap("OpenUserInfo")
        private OpenUserInfo openUserInfo;

        private Result(Builder builder) {
            this.openDeviceInfo = builder.openDeviceInfo;
            this.openUserInfo = builder.openUserInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return openDeviceInfo
         */
        public OpenDeviceInfo getOpenDeviceInfo() {
            return this.openDeviceInfo;
        }

        /**
         * @return openUserInfo
         */
        public OpenUserInfo getOpenUserInfo() {
            return this.openUserInfo;
        }

        public static final class Builder {
            private OpenDeviceInfo openDeviceInfo; 
            private OpenUserInfo openUserInfo; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.openDeviceInfo = model.openDeviceInfo;
                this.openUserInfo = model.openUserInfo;
            } 

            /**
             * OpenDeviceInfo.
             */
            public Builder openDeviceInfo(OpenDeviceInfo openDeviceInfo) {
                this.openDeviceInfo = openDeviceInfo;
                return this;
            }

            /**
             * OpenUserInfo.
             */
            public Builder openUserInfo(OpenUserInfo openUserInfo) {
                this.openUserInfo = openUserInfo;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
