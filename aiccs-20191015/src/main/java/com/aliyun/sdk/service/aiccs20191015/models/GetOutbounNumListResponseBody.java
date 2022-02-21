// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOutbounNumListResponseBody} extends {@link TeaModel}
 *
 * <p>GetOutbounNumListResponseBody</p>
 */
public class GetOutbounNumListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("HttpStatusCode")
    private Long httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetOutbounNumListResponseBody(Builder builder) {
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

    public static GetOutbounNumListResponseBody create() {
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
     * @return httpStatusCode
     */
    public Long getHttpStatusCode() {
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
        private Long httpStatusCode; 
        private String message; 
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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Long httpStatusCode) {
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

        public GetOutbounNumListResponseBody build() {
            return new GetOutbounNumListResponseBody(this);
        } 

    } 

    public static class Num extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Type")
        private Integer type;

        @NameInMap("Value")
        private String value;

        private Num(Builder builder) {
            this.description = builder.description;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Num create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private Integer type; 
            private String value; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Num build() {
                return new Num(this);
            } 

        } 

    }
    public static class NumGroup extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Type")
        private Integer type;

        @NameInMap("Value")
        private String value;

        private NumGroup(Builder builder) {
            this.description = builder.description;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NumGroup create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private Integer type; 
            private String value; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public NumGroup build() {
                return new NumGroup(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Num")
        private java.util.List < Num> num;

        @NameInMap("NumGroup")
        private java.util.List < NumGroup> numGroup;

        private Data(Builder builder) {
            this.num = builder.num;
            this.numGroup = builder.numGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return num
         */
        public java.util.List < Num> getNum() {
            return this.num;
        }

        /**
         * @return numGroup
         */
        public java.util.List < NumGroup> getNumGroup() {
            return this.numGroup;
        }

        public static final class Builder {
            private java.util.List < Num> num; 
            private java.util.List < NumGroup> numGroup; 

            /**
             * Num.
             */
            public Builder num(java.util.List < Num> num) {
                this.num = num;
                return this;
            }

            /**
             * NumGroup.
             */
            public Builder numGroup(java.util.List < NumGroup> numGroup) {
                this.numGroup = numGroup;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
