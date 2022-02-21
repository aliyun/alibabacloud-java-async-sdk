// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pcdn20170411.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAllAppVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>GetAllAppVersionsResponseBody</p>
 */
public class GetAllAppVersionsResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("DataList")
    private DataList dataList;

    @NameInMap("RequestId")
    private String requestId;

    private GetAllAppVersionsResponseBody(Builder builder) {
        this.code = builder.code;
        this.dataList = builder.dataList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAllAppVersionsResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer code; 
        private DataList dataList; 
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAllAppVersionsResponseBody build() {
            return new GetAllAppVersionsResponseBody(this);
        } 

    } 

    public static class UsageData extends TeaModel {
        @NameInMap("Code")
        private Integer code;

        @NameInMap("Value")
        private String value;

        private UsageData(Builder builder) {
            this.code = builder.code;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UsageData create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public Integer getCode() {
            return this.code;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Integer code; 
            private String value; 

            /**
             * Code.
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
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
}
