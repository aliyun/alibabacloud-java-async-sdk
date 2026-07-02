// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliyunauth20181222.models;

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
 * {@link QueryAuthResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAuthResponseBody</p>
 */
public class QueryAuthResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryAuthResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAuthResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryAuthResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(Integer code) {
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

        public QueryAuthResponseBody build() {
            return new QueryAuthResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryAuthResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAuthResponseBody</p>
     */
    public static class InfoDTOList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthOrderVid")
        private String authOrderVid;

        @com.aliyun.core.annotation.NameInMap("ItemName")
        private String itemName;

        @com.aliyun.core.annotation.NameInMap("ItemRecordVid")
        private String itemRecordVid;

        @com.aliyun.core.annotation.NameInMap("OperateCode")
        private String operateCode;

        private InfoDTOList(Builder builder) {
            this.authOrderVid = builder.authOrderVid;
            this.itemName = builder.itemName;
            this.itemRecordVid = builder.itemRecordVid;
            this.operateCode = builder.operateCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InfoDTOList create() {
            return builder().build();
        }

        /**
         * @return authOrderVid
         */
        public String getAuthOrderVid() {
            return this.authOrderVid;
        }

        /**
         * @return itemName
         */
        public String getItemName() {
            return this.itemName;
        }

        /**
         * @return itemRecordVid
         */
        public String getItemRecordVid() {
            return this.itemRecordVid;
        }

        /**
         * @return operateCode
         */
        public String getOperateCode() {
            return this.operateCode;
        }

        public static final class Builder {
            private String authOrderVid; 
            private String itemName; 
            private String itemRecordVid; 
            private String operateCode; 

            private Builder() {
            } 

            private Builder(InfoDTOList model) {
                this.authOrderVid = model.authOrderVid;
                this.itemName = model.itemName;
                this.itemRecordVid = model.itemRecordVid;
                this.operateCode = model.operateCode;
            } 

            /**
             * AuthOrderVid.
             */
            public Builder authOrderVid(String authOrderVid) {
                this.authOrderVid = authOrderVid;
                return this;
            }

            /**
             * ItemName.
             */
            public Builder itemName(String itemName) {
                this.itemName = itemName;
                return this;
            }

            /**
             * ItemRecordVid.
             */
            public Builder itemRecordVid(String itemRecordVid) {
                this.itemRecordVid = itemRecordVid;
                return this;
            }

            /**
             * OperateCode.
             */
            public Builder operateCode(String operateCode) {
                this.operateCode = operateCode;
                return this;
            }

            public InfoDTOList build() {
                return new InfoDTOList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAuthResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAuthResponseBody</p>
     */
    public static class DataInfoDTOList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InfoDTOList")
        private java.util.List<InfoDTOList> infoDTOList;

        private DataInfoDTOList(Builder builder) {
            this.infoDTOList = builder.infoDTOList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataInfoDTOList create() {
            return builder().build();
        }

        /**
         * @return infoDTOList
         */
        public java.util.List<InfoDTOList> getInfoDTOList() {
            return this.infoDTOList;
        }

        public static final class Builder {
            private java.util.List<InfoDTOList> infoDTOList; 

            private Builder() {
            } 

            private Builder(DataInfoDTOList model) {
                this.infoDTOList = model.infoDTOList;
            } 

            /**
             * InfoDTOList.
             */
            public Builder infoDTOList(java.util.List<InfoDTOList> infoDTOList) {
                this.infoDTOList = infoDTOList;
                return this;
            }

            public DataInfoDTOList build() {
                return new DataInfoDTOList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAuthResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAuthResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InfoDTOList")
        private DataInfoDTOList infoDTOList;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        private Data(Builder builder) {
            this.infoDTOList = builder.infoDTOList;
            this.instanceId = builder.instanceId;
            this.productCode = builder.productCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return infoDTOList
         */
        public DataInfoDTOList getInfoDTOList() {
            return this.infoDTOList;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        public static final class Builder {
            private DataInfoDTOList infoDTOList; 
            private String instanceId; 
            private String productCode; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.infoDTOList = model.infoDTOList;
                this.instanceId = model.instanceId;
                this.productCode = model.productCode;
            } 

            /**
             * InfoDTOList.
             */
            public Builder infoDTOList(DataInfoDTOList infoDTOList) {
                this.infoDTOList = infoDTOList;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * ProductCode.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
