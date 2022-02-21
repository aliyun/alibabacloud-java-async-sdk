// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAIActionConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetAIActionConfigResponseBody</p>
 */
public class GetAIActionConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetAIActionConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAIActionConfigResponseBody create() {
        return builder().build();
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
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

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
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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

        public GetAIActionConfigResponseBody build() {
            return new GetAIActionConfigResponseBody(this);
        } 

    } 

    public static class InParamList extends TeaModel {
        @NameInMap("ConfigItems")
        private java.util.List < String > configItems;

        @NameInMap("DataType")
        private String dataType;

        @NameInMap("NeedConfig")
        private Boolean needConfig;

        private InParamList(Builder builder) {
            this.configItems = builder.configItems;
            this.dataType = builder.dataType;
            this.needConfig = builder.needConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InParamList create() {
            return builder().build();
        }

        /**
         * @return configItems
         */
        public java.util.List < String > getConfigItems() {
            return this.configItems;
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        /**
         * @return needConfig
         */
        public Boolean getNeedConfig() {
            return this.needConfig;
        }

        public static final class Builder {
            private java.util.List < String > configItems; 
            private String dataType; 
            private Boolean needConfig; 

            /**
             * ConfigItems.
             */
            public Builder configItems(java.util.List < String > configItems) {
                this.configItems = configItems;
                return this;
            }

            /**
             * DataType.
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * NeedConfig.
             */
            public Builder needConfig(Boolean needConfig) {
                this.needConfig = needConfig;
                return this;
            }

            public InParamList build() {
                return new InParamList(this);
            } 

        } 

    }
    public static class OutParamList extends TeaModel {
        @NameInMap("ConfigItems")
        private java.util.List < String > configItems;

        @NameInMap("DataType")
        private String dataType;

        @NameInMap("NeedConfig")
        private Boolean needConfig;

        private OutParamList(Builder builder) {
            this.configItems = builder.configItems;
            this.dataType = builder.dataType;
            this.needConfig = builder.needConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutParamList create() {
            return builder().build();
        }

        /**
         * @return configItems
         */
        public java.util.List < String > getConfigItems() {
            return this.configItems;
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        /**
         * @return needConfig
         */
        public Boolean getNeedConfig() {
            return this.needConfig;
        }

        public static final class Builder {
            private java.util.List < String > configItems; 
            private String dataType; 
            private Boolean needConfig; 

            /**
             * ConfigItems.
             */
            public Builder configItems(java.util.List < String > configItems) {
                this.configItems = configItems;
                return this;
            }

            /**
             * DataType.
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * NeedConfig.
             */
            public Builder needConfig(Boolean needConfig) {
                this.needConfig = needConfig;
                return this;
            }

            public OutParamList build() {
                return new OutParamList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("AlgoAction")
        private String algoAction;

        @NameInMap("AlgoConfigItems")
        private String algoConfigItems;

        @NameInMap("Des")
        private String des;

        @NameInMap("InParamList")
        private java.util.List < InParamList> inParamList;

        @NameInMap("NeedDevice")
        private Boolean needDevice;

        @NameInMap("OutParamList")
        private java.util.List < OutParamList> outParamList;

        @NameInMap("Sync")
        private String sync;

        private Data(Builder builder) {
            this.algoAction = builder.algoAction;
            this.algoConfigItems = builder.algoConfigItems;
            this.des = builder.des;
            this.inParamList = builder.inParamList;
            this.needDevice = builder.needDevice;
            this.outParamList = builder.outParamList;
            this.sync = builder.sync;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return algoAction
         */
        public String getAlgoAction() {
            return this.algoAction;
        }

        /**
         * @return algoConfigItems
         */
        public String getAlgoConfigItems() {
            return this.algoConfigItems;
        }

        /**
         * @return des
         */
        public String getDes() {
            return this.des;
        }

        /**
         * @return inParamList
         */
        public java.util.List < InParamList> getInParamList() {
            return this.inParamList;
        }

        /**
         * @return needDevice
         */
        public Boolean getNeedDevice() {
            return this.needDevice;
        }

        /**
         * @return outParamList
         */
        public java.util.List < OutParamList> getOutParamList() {
            return this.outParamList;
        }

        /**
         * @return sync
         */
        public String getSync() {
            return this.sync;
        }

        public static final class Builder {
            private String algoAction; 
            private String algoConfigItems; 
            private String des; 
            private java.util.List < InParamList> inParamList; 
            private Boolean needDevice; 
            private java.util.List < OutParamList> outParamList; 
            private String sync; 

            /**
             * AlgoAction.
             */
            public Builder algoAction(String algoAction) {
                this.algoAction = algoAction;
                return this;
            }

            /**
             * AlgoConfigItems.
             */
            public Builder algoConfigItems(String algoConfigItems) {
                this.algoConfigItems = algoConfigItems;
                return this;
            }

            /**
             * Des.
             */
            public Builder des(String des) {
                this.des = des;
                return this;
            }

            /**
             * InParamList.
             */
            public Builder inParamList(java.util.List < InParamList> inParamList) {
                this.inParamList = inParamList;
                return this;
            }

            /**
             * NeedDevice.
             */
            public Builder needDevice(Boolean needDevice) {
                this.needDevice = needDevice;
                return this;
            }

            /**
             * OutParamList.
             */
            public Builder outParamList(java.util.List < OutParamList> outParamList) {
                this.outParamList = outParamList;
                return this;
            }

            /**
             * Sync.
             */
            public Builder sync(String sync) {
                this.sync = sync;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
