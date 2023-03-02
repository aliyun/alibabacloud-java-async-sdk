// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDependentDataModelsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDependentDataModelsResponseBody</p>
 */
public class ListDependentDataModelsResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListDependentDataModelsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDependentDataModelsResponseBody create() {
        return builder().build();
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

        public ListDependentDataModelsResponseBody build() {
            return new ListDependentDataModelsResponseBody(this);
        } 

    } 

    public static class DataModelInfo extends TeaModel {
        @NameInMap("DataModelCode")
        private String dataModelCode;

        @NameInMap("DataModelName")
        private String dataModelName;

        private DataModelInfo(Builder builder) {
            this.dataModelCode = builder.dataModelCode;
            this.dataModelName = builder.dataModelName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataModelInfo create() {
            return builder().build();
        }

        /**
         * @return dataModelCode
         */
        public String getDataModelCode() {
            return this.dataModelCode;
        }

        /**
         * @return dataModelName
         */
        public String getDataModelName() {
            return this.dataModelName;
        }

        public static final class Builder {
            private String dataModelCode; 
            private String dataModelName; 

            /**
             * DataModelCode.
             */
            public Builder dataModelCode(String dataModelCode) {
                this.dataModelCode = dataModelCode;
                return this;
            }

            /**
             * DataModelName.
             */
            public Builder dataModelName(String dataModelName) {
                this.dataModelName = dataModelName;
                return this;
            }

            public DataModelInfo build() {
                return new DataModelInfo(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("DataModelInfo")
        private java.util.List < DataModelInfo> dataModelInfo;

        private Data(Builder builder) {
            this.dataModelInfo = builder.dataModelInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dataModelInfo
         */
        public java.util.List < DataModelInfo> getDataModelInfo() {
            return this.dataModelInfo;
        }

        public static final class Builder {
            private java.util.List < DataModelInfo> dataModelInfo; 

            /**
             * DataModelInfo.
             */
            public Builder dataModelInfo(java.util.List < DataModelInfo> dataModelInfo) {
                this.dataModelInfo = dataModelInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
