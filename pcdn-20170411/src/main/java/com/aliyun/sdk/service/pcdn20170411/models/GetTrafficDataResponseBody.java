// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pcdn20170411.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTrafficDataResponseBody} extends {@link TeaModel}
 *
 * <p>GetTrafficDataResponseBody</p>
 */
public class GetTrafficDataResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("DataList")
    private DataList dataList;

    @NameInMap("Labels")
    private Labels labels;

    @NameInMap("RequestId")
    private String requestId;

    private GetTrafficDataResponseBody(Builder builder) {
        this.code = builder.code;
        this.dataList = builder.dataList;
        this.labels = builder.labels;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTrafficDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return dataList
     */
    public DataList getDataList() {
        return this.dataList;
    }

    /**
     * @return labels
     */
    public Labels getLabels() {
        return this.labels;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer code; 
        private DataList dataList; 
        private Labels labels; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * DataList.
         */
        public Builder dataList(DataList dataList) {
            this.dataList = dataList;
            return this;
        }

        /**
         * Labels.
         */
        public Builder labels(Labels labels) {
            this.labels = labels;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetTrafficDataResponseBody build() {
            return new GetTrafficDataResponseBody(this);
        } 

    } 

    public static class Values extends TeaModel {
        @NameInMap("Values")
        private java.util.List < String > values;

        private Values(Builder builder) {
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Values create() {
            return builder().build();
        }

        /**
         * @return values
         */
        public java.util.List < String > getValues() {
            return this.values;
        }

        public static final class Builder {
            private java.util.List < String > values; 

            /**
             * Values.
             */
            public Builder values(java.util.List < String > values) {
                this.values = values;
                return this;
            }

            public Values build() {
                return new Values(this);
            } 

        } 

    }
    public static class UsageData extends TeaModel {
        @NameInMap("Date")
        private String date;

        @NameInMap("Values")
        private Values values;

        private UsageData(Builder builder) {
            this.date = builder.date;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UsageData create() {
            return builder().build();
        }

        /**
         * @return date
         */
        public String getDate() {
            return this.date;
        }

        /**
         * @return values
         */
        public Values getValues() {
            return this.values;
        }

        public static final class Builder {
            private String date; 
            private Values values; 

            /**
             * Date.
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * Values.
             */
            public Builder values(Values values) {
                this.values = values;
                return this;
            }

            public UsageData build() {
                return new UsageData(this);
            } 

        } 

    }
    public static class DataList extends TeaModel {
        @NameInMap("UsageData")
        private java.util.List < UsageData> usageData;

        private DataList(Builder builder) {
            this.usageData = builder.usageData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return usageData
         */
        public java.util.List < UsageData> getUsageData() {
            return this.usageData;
        }

        public static final class Builder {
            private java.util.List < UsageData> usageData; 

            /**
             * UsageData.
             */
            public Builder usageData(java.util.List < UsageData> usageData) {
                this.usageData = usageData;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
    public static class Labels extends TeaModel {
        @NameInMap("Label")
        private java.util.List < String > label;

        private Labels(Builder builder) {
            this.label = builder.label;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Labels create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public java.util.List < String > getLabel() {
            return this.label;
        }

        public static final class Builder {
            private java.util.List < String > label; 

            /**
             * Label.
             */
            public Builder label(java.util.List < String > label) {
                this.label = label;
                return this;
            }

            public Labels build() {
                return new Labels(this);
            } 

        } 

    }
}
