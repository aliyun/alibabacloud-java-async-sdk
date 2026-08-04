// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606.models;

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
 * {@link MapFromHavanaBindIdResponseBody} extends {@link TeaModel}
 *
 * <p>MapFromHavanaBindIdResponseBody</p>
 */
public class MapFromHavanaBindIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpCode")
    private String httpCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private MapFromHavanaBindIdResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpCode = builder.httpCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MapFromHavanaBindIdResponseBody create() {
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
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return httpCode
     */
    public String getHttpCode() {
        return this.httpCode;
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
        private java.util.List<Data> data; 
        private String httpCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(MapFromHavanaBindIdResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpCode = model.httpCode;
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
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * HttpCode.
         */
        public Builder httpCode(String httpCode) {
            this.httpCode = httpCode;
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

        public MapFromHavanaBindIdResponseBody build() {
            return new MapFromHavanaBindIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link MapFromHavanaBindIdResponseBody} extends {@link TeaModel}
     *
     * <p>MapFromHavanaBindIdResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindHid")
        private String bindHid;

        @com.aliyun.core.annotation.NameInMap("HavanaBindId")
        private String havanaBindId;

        @com.aliyun.core.annotation.NameInMap("HavanaBindStation")
        private String havanaBindStation;

        @com.aliyun.core.annotation.NameInMap("Pk")
        private String pk;

        private Data(Builder builder) {
            this.bindHid = builder.bindHid;
            this.havanaBindId = builder.havanaBindId;
            this.havanaBindStation = builder.havanaBindStation;
            this.pk = builder.pk;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bindHid
         */
        public String getBindHid() {
            return this.bindHid;
        }

        /**
         * @return havanaBindId
         */
        public String getHavanaBindId() {
            return this.havanaBindId;
        }

        /**
         * @return havanaBindStation
         */
        public String getHavanaBindStation() {
            return this.havanaBindStation;
        }

        /**
         * @return pk
         */
        public String getPk() {
            return this.pk;
        }

        public static final class Builder {
            private String bindHid; 
            private String havanaBindId; 
            private String havanaBindStation; 
            private String pk; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.bindHid = model.bindHid;
                this.havanaBindId = model.havanaBindId;
                this.havanaBindStation = model.havanaBindStation;
                this.pk = model.pk;
            } 

            /**
             * BindHid.
             */
            public Builder bindHid(String bindHid) {
                this.bindHid = bindHid;
                return this;
            }

            /**
             * HavanaBindId.
             */
            public Builder havanaBindId(String havanaBindId) {
                this.havanaBindId = havanaBindId;
                return this;
            }

            /**
             * HavanaBindStation.
             */
            public Builder havanaBindStation(String havanaBindStation) {
                this.havanaBindStation = havanaBindStation;
                return this;
            }

            /**
             * Pk.
             */
            public Builder pk(String pk) {
                this.pk = pk;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
