// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link GetDataSourceOrderConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataSourceOrderConfigResponseBody</p>
 */
public class GetDataSourceOrderConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetDataSourceOrderConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataSourceOrderConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetDataSourceOrderConfigResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        public GetDataSourceOrderConfigResponseBody build() {
            return new GetDataSourceOrderConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDataSourceOrderConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataSourceOrderConfigResponseBody</p>
     */
    public static class UserConfigDataSourceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Number")
        private Integer number;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private UserConfigDataSourceList(Builder builder) {
            this.code = builder.code;
            this.enable = builder.enable;
            this.name = builder.name;
            this.number = builder.number;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserConfigDataSourceList create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return number
         */
        public Integer getNumber() {
            return this.number;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String code; 
            private Boolean enable; 
            private String name; 
            private Integer number; 
            private String type; 

            private Builder() {
            } 

            private Builder(UserConfigDataSourceList model) {
                this.code = model.code;
                this.enable = model.enable;
                this.name = model.name;
                this.number = model.number;
                this.type = model.type;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Number.
             */
            public Builder number(Integer number) {
                this.number = number;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public UserConfigDataSourceList build() {
                return new UserConfigDataSourceList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataSourceOrderConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataSourceOrderConfigResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TotalDocSize")
        private Integer totalDocSize;

        @com.aliyun.core.annotation.NameInMap("UserConfigDataSourceList")
        private java.util.List<UserConfigDataSourceList> userConfigDataSourceList;

        private Data(Builder builder) {
            this.totalDocSize = builder.totalDocSize;
            this.userConfigDataSourceList = builder.userConfigDataSourceList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return totalDocSize
         */
        public Integer getTotalDocSize() {
            return this.totalDocSize;
        }

        /**
         * @return userConfigDataSourceList
         */
        public java.util.List<UserConfigDataSourceList> getUserConfigDataSourceList() {
            return this.userConfigDataSourceList;
        }

        public static final class Builder {
            private Integer totalDocSize; 
            private java.util.List<UserConfigDataSourceList> userConfigDataSourceList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.totalDocSize = model.totalDocSize;
                this.userConfigDataSourceList = model.userConfigDataSourceList;
            } 

            /**
             * TotalDocSize.
             */
            public Builder totalDocSize(Integer totalDocSize) {
                this.totalDocSize = totalDocSize;
                return this;
            }

            /**
             * UserConfigDataSourceList.
             */
            public Builder userConfigDataSourceList(java.util.List<UserConfigDataSourceList> userConfigDataSourceList) {
                this.userConfigDataSourceList = userConfigDataSourceList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
