// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link GetSpeechVoiceResponseBody} extends {@link TeaModel}
 *
 * <p>GetSpeechVoiceResponseBody</p>
 */
public class GetSpeechVoiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetSpeechVoiceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSpeechVoiceResponseBody create() {
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

        private Builder() {
        } 

        private Builder(GetSpeechVoiceResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
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

        public GetSpeechVoiceResponseBody build() {
            return new GetSpeechVoiceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSpeechVoiceResponseBody} extends {@link TeaModel}
     *
     * <p>GetSpeechVoiceResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Items(Builder builder) {
            this.label = builder.label;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String label; 
            private String value; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.label = model.label;
                this.value = model.value;
            } 

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSpeechVoiceResponseBody} extends {@link TeaModel}
     *
     * <p>GetSpeechVoiceResponseBody</p>
     */
    public static class VoiceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List<Items> items;

        private VoiceList(Builder builder) {
            this.items = builder.items;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VoiceList create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List<Items> getItems() {
            return this.items;
        }

        public static final class Builder {
            private java.util.List<Items> items; 

            private Builder() {
            } 

            private Builder(VoiceList model) {
                this.items = model.items;
            } 

            /**
             * Items.
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            public VoiceList build() {
                return new VoiceList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSpeechVoiceResponseBody} extends {@link TeaModel}
     *
     * <p>GetSpeechVoiceResponseBody</p>
     */
    public static class DataItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        @com.aliyun.core.annotation.NameInMap("VoiceList")
        private VoiceList voiceList;

        private DataItems(Builder builder) {
            this.label = builder.label;
            this.value = builder.value;
            this.voiceList = builder.voiceList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataItems create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        /**
         * @return voiceList
         */
        public VoiceList getVoiceList() {
            return this.voiceList;
        }

        public static final class Builder {
            private String label; 
            private String value; 
            private VoiceList voiceList; 

            private Builder() {
            } 

            private Builder(DataItems model) {
                this.label = model.label;
                this.value = model.value;
                this.voiceList = model.voiceList;
            } 

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * VoiceList.
             */
            public Builder voiceList(VoiceList voiceList) {
                this.voiceList = voiceList;
                return this;
            }

            public DataItems build() {
                return new DataItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSpeechVoiceResponseBody} extends {@link TeaModel}
     *
     * <p>GetSpeechVoiceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List<DataItems> items;

        private Data(Builder builder) {
            this.items = builder.items;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List<DataItems> getItems() {
            return this.items;
        }

        public static final class Builder {
            private java.util.List<DataItems> items; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.items = model.items;
            } 

            /**
             * Items.
             */
            public Builder items(java.util.List<DataItems> items) {
                this.items = items;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
