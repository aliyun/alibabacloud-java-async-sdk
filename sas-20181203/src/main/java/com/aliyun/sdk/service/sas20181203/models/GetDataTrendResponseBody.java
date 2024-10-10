// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDataTrendResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataTrendResponseBody</p>
 */
public class GetDataTrendResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDataTrendResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataTrendResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * <p>The response parameters.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1383B0DB-D5D6-4B0C-9E6B-75939C8E****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDataTrendResponseBody build() {
            return new GetDataTrendResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDataTrendResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataTrendResponseBody</p>
     */
    public static class ItemList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CountList")
        private java.util.List < Long > countList;

        @com.aliyun.core.annotation.NameInMap("KeyName")
        private String keyName;

        private ItemList(Builder builder) {
            this.countList = builder.countList;
            this.keyName = builder.keyName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItemList create() {
            return builder().build();
        }

        /**
         * @return countList
         */
        public java.util.List < Long > getCountList() {
            return this.countList;
        }

        /**
         * @return keyName
         */
        public String getKeyName() {
            return this.keyName;
        }

        public static final class Builder {
            private java.util.List < Long > countList; 
            private String keyName; 

            /**
             * <p>The statistical values of the trend data.</p>
             */
            public Builder countList(java.util.List < Long > countList) {
                this.countList = countList;
                return this;
            }

            /**
             * <p>The type of the security data. Valid values:</p>
             * <ul>
             * <li><strong>HC_NEW</strong>: the number of new baseline risks.</li>
             * <li><strong>HC_OPERATE</strong>: the number of handled baseline risks.</li>
             * <li><strong>VUL_NEW</strong>: the number of new vulnerabilities.</li>
             * <li><strong>VUL_OPERATE</strong>: the number of handled vulnerabilities.</li>
             * <li><strong>SUSP_NEW</strong>: the number of new alerts.</li>
             * <li><strong>SUSP_OPERATE</strong>: the number of handled alerts.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>HC_NEW</p>
             */
            public Builder keyName(String keyName) {
                this.keyName = keyName;
                return this;
            }

            public ItemList build() {
                return new ItemList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataTrendResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataTrendResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DateList")
        private java.util.List < Integer > dateList;

        @com.aliyun.core.annotation.NameInMap("DateStrList")
        private java.util.List < String > dateStrList;

        @com.aliyun.core.annotation.NameInMap("ItemList")
        private java.util.List < ItemList> itemList;

        private Data(Builder builder) {
            this.dateList = builder.dateList;
            this.dateStrList = builder.dateStrList;
            this.itemList = builder.itemList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dateList
         */
        public java.util.List < Integer > getDateList() {
            return this.dateList;
        }

        /**
         * @return dateStrList
         */
        public java.util.List < String > getDateStrList() {
            return this.dateStrList;
        }

        /**
         * @return itemList
         */
        public java.util.List < ItemList> getItemList() {
            return this.itemList;
        }

        public static final class Builder {
            private java.util.List < Integer > dateList; 
            private java.util.List < String > dateStrList; 
            private java.util.List < ItemList> itemList; 

            /**
             * <p>The statistical timestamps of the trend data.</p>
             */
            public Builder dateList(java.util.List < Integer > dateList) {
                this.dateList = dateList;
                return this;
            }

            /**
             * <p>The statistical dates and time for the trend data.</p>
             */
            public Builder dateStrList(java.util.List < String > dateStrList) {
                this.dateStrList = dateStrList;
                return this;
            }

            /**
             * <p>The returned data.</p>
             */
            public Builder itemList(java.util.List < ItemList> itemList) {
                this.itemList = itemList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
