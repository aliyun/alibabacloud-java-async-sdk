// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypns20170620.models;

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
 * {@link QueryDictDataItemResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDictDataItemResponseBody</p>
 */
public class QueryDictDataItemResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryDictDataItemResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDictDataItemResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(QueryDictDataItemResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
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

        public QueryDictDataItemResponseBody build() {
            return new QueryDictDataItemResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryDictDataItemResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDictDataItemResponseBody</p>
     */
    public static class SubListData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClassifyItemCode")
        private String classifyItemCode;

        @com.aliyun.core.annotation.NameInMap("ClassifyItemValue")
        private String classifyItemValue;

        @com.aliyun.core.annotation.NameInMap("DataItemCode")
        private String dataItemCode;

        @com.aliyun.core.annotation.NameInMap("DataItemOrder")
        private Integer dataItemOrder;

        @com.aliyun.core.annotation.NameInMap("DataItemParent")
        private String dataItemParent;

        @com.aliyun.core.annotation.NameInMap("DataItemValue")
        private String dataItemValue;

        @com.aliyun.core.annotation.NameInMap("ItemType")
        private Integer itemType;

        private SubListData(Builder builder) {
            this.classifyItemCode = builder.classifyItemCode;
            this.classifyItemValue = builder.classifyItemValue;
            this.dataItemCode = builder.dataItemCode;
            this.dataItemOrder = builder.dataItemOrder;
            this.dataItemParent = builder.dataItemParent;
            this.dataItemValue = builder.dataItemValue;
            this.itemType = builder.itemType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubListData create() {
            return builder().build();
        }

        /**
         * @return classifyItemCode
         */
        public String getClassifyItemCode() {
            return this.classifyItemCode;
        }

        /**
         * @return classifyItemValue
         */
        public String getClassifyItemValue() {
            return this.classifyItemValue;
        }

        /**
         * @return dataItemCode
         */
        public String getDataItemCode() {
            return this.dataItemCode;
        }

        /**
         * @return dataItemOrder
         */
        public Integer getDataItemOrder() {
            return this.dataItemOrder;
        }

        /**
         * @return dataItemParent
         */
        public String getDataItemParent() {
            return this.dataItemParent;
        }

        /**
         * @return dataItemValue
         */
        public String getDataItemValue() {
            return this.dataItemValue;
        }

        /**
         * @return itemType
         */
        public Integer getItemType() {
            return this.itemType;
        }

        public static final class Builder {
            private String classifyItemCode; 
            private String classifyItemValue; 
            private String dataItemCode; 
            private Integer dataItemOrder; 
            private String dataItemParent; 
            private String dataItemValue; 
            private Integer itemType; 

            private Builder() {
            } 

            private Builder(SubListData model) {
                this.classifyItemCode = model.classifyItemCode;
                this.classifyItemValue = model.classifyItemValue;
                this.dataItemCode = model.dataItemCode;
                this.dataItemOrder = model.dataItemOrder;
                this.dataItemParent = model.dataItemParent;
                this.dataItemValue = model.dataItemValue;
                this.itemType = model.itemType;
            } 

            /**
             * ClassifyItemCode.
             */
            public Builder classifyItemCode(String classifyItemCode) {
                this.classifyItemCode = classifyItemCode;
                return this;
            }

            /**
             * ClassifyItemValue.
             */
            public Builder classifyItemValue(String classifyItemValue) {
                this.classifyItemValue = classifyItemValue;
                return this;
            }

            /**
             * DataItemCode.
             */
            public Builder dataItemCode(String dataItemCode) {
                this.dataItemCode = dataItemCode;
                return this;
            }

            /**
             * DataItemOrder.
             */
            public Builder dataItemOrder(Integer dataItemOrder) {
                this.dataItemOrder = dataItemOrder;
                return this;
            }

            /**
             * DataItemParent.
             */
            public Builder dataItemParent(String dataItemParent) {
                this.dataItemParent = dataItemParent;
                return this;
            }

            /**
             * DataItemValue.
             */
            public Builder dataItemValue(String dataItemValue) {
                this.dataItemValue = dataItemValue;
                return this;
            }

            /**
             * ItemType.
             */
            public Builder itemType(Integer itemType) {
                this.itemType = itemType;
                return this;
            }

            public SubListData build() {
                return new SubListData(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryDictDataItemResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDictDataItemResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClassifyItemCode")
        private String classifyItemCode;

        @com.aliyun.core.annotation.NameInMap("ClassifyItemValue")
        private String classifyItemValue;

        @com.aliyun.core.annotation.NameInMap("DataItemCode")
        private String dataItemCode;

        @com.aliyun.core.annotation.NameInMap("DataItemOrder")
        private Integer dataItemOrder;

        @com.aliyun.core.annotation.NameInMap("DataItemParent")
        private String dataItemParent;

        @com.aliyun.core.annotation.NameInMap("DataItemValue")
        private String dataItemValue;

        @com.aliyun.core.annotation.NameInMap("ItemType")
        private Integer itemType;

        @com.aliyun.core.annotation.NameInMap("SubListData")
        private java.util.List<SubListData> subListData;

        private Data(Builder builder) {
            this.classifyItemCode = builder.classifyItemCode;
            this.classifyItemValue = builder.classifyItemValue;
            this.dataItemCode = builder.dataItemCode;
            this.dataItemOrder = builder.dataItemOrder;
            this.dataItemParent = builder.dataItemParent;
            this.dataItemValue = builder.dataItemValue;
            this.itemType = builder.itemType;
            this.subListData = builder.subListData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return classifyItemCode
         */
        public String getClassifyItemCode() {
            return this.classifyItemCode;
        }

        /**
         * @return classifyItemValue
         */
        public String getClassifyItemValue() {
            return this.classifyItemValue;
        }

        /**
         * @return dataItemCode
         */
        public String getDataItemCode() {
            return this.dataItemCode;
        }

        /**
         * @return dataItemOrder
         */
        public Integer getDataItemOrder() {
            return this.dataItemOrder;
        }

        /**
         * @return dataItemParent
         */
        public String getDataItemParent() {
            return this.dataItemParent;
        }

        /**
         * @return dataItemValue
         */
        public String getDataItemValue() {
            return this.dataItemValue;
        }

        /**
         * @return itemType
         */
        public Integer getItemType() {
            return this.itemType;
        }

        /**
         * @return subListData
         */
        public java.util.List<SubListData> getSubListData() {
            return this.subListData;
        }

        public static final class Builder {
            private String classifyItemCode; 
            private String classifyItemValue; 
            private String dataItemCode; 
            private Integer dataItemOrder; 
            private String dataItemParent; 
            private String dataItemValue; 
            private Integer itemType; 
            private java.util.List<SubListData> subListData; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.classifyItemCode = model.classifyItemCode;
                this.classifyItemValue = model.classifyItemValue;
                this.dataItemCode = model.dataItemCode;
                this.dataItemOrder = model.dataItemOrder;
                this.dataItemParent = model.dataItemParent;
                this.dataItemValue = model.dataItemValue;
                this.itemType = model.itemType;
                this.subListData = model.subListData;
            } 

            /**
             * ClassifyItemCode.
             */
            public Builder classifyItemCode(String classifyItemCode) {
                this.classifyItemCode = classifyItemCode;
                return this;
            }

            /**
             * ClassifyItemValue.
             */
            public Builder classifyItemValue(String classifyItemValue) {
                this.classifyItemValue = classifyItemValue;
                return this;
            }

            /**
             * DataItemCode.
             */
            public Builder dataItemCode(String dataItemCode) {
                this.dataItemCode = dataItemCode;
                return this;
            }

            /**
             * DataItemOrder.
             */
            public Builder dataItemOrder(Integer dataItemOrder) {
                this.dataItemOrder = dataItemOrder;
                return this;
            }

            /**
             * DataItemParent.
             */
            public Builder dataItemParent(String dataItemParent) {
                this.dataItemParent = dataItemParent;
                return this;
            }

            /**
             * DataItemValue.
             */
            public Builder dataItemValue(String dataItemValue) {
                this.dataItemValue = dataItemValue;
                return this;
            }

            /**
             * ItemType.
             */
            public Builder itemType(Integer itemType) {
                this.itemType = itemType;
                return this;
            }

            /**
             * SubListData.
             */
            public Builder subListData(java.util.List<SubListData> subListData) {
                this.subListData = subListData;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
