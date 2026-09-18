// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link GetOutbounNumListResponseBody} extends {@link TeaModel}
 *
 * <p>GetOutbounNumListResponseBody</p>
 */
public class GetOutbounNumListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Long httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

        private Builder() {
        } 

        private Builder(GetOutbounNumListResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>Status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Information about the number list.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Long httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Description of the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EE338D98-9BD3-4413-B165</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the API call succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetOutbounNumListResponseBody build() {
            return new GetOutbounNumListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetOutbounNumListResponseBody} extends {@link TeaModel}
     *
     * <p>GetOutbounNumListResponseBody</p>
     */
    public static class Num extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Num model) {
                this.description = model.description;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * <p>Description of the caller number (geographic location information).</p>
             * 
             * <strong>example:</strong>
             * <p>浙江省杭州市</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Caller number type. Valid values:  </p>
             * <ul>
             * <li><strong>1</strong>: Number.  </li>
             * <li><strong>2</strong>: Number group.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * <p>Caller number.</p>
             * 
             * <strong>example:</strong>
             * <p>07512234****</p>
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
    /**
     * 
     * {@link GetOutbounNumListResponseBody} extends {@link TeaModel}
     *
     * <p>GetOutbounNumListResponseBody</p>
     */
    public static class NumGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(NumGroup model) {
                this.description = model.description;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * <p>Number group description (number group name).</p>
             * 
             * <strong>example:</strong>
             * <p>Jella</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Number group type. Valid values:  </p>
             * <ul>
             * <li><strong>1</strong>: Number.  </li>
             * <li><strong>2</strong>: Number group.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * <p>Number group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>7688****</p>
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
    /**
     * 
     * {@link GetOutbounNumListResponseBody} extends {@link TeaModel}
     *
     * <p>GetOutbounNumListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Num")
        private java.util.List<Num> num;

        @com.aliyun.core.annotation.NameInMap("NumGroup")
        private java.util.List<NumGroup> numGroup;

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
        public java.util.List<Num> getNum() {
            return this.num;
        }

        /**
         * @return numGroup
         */
        public java.util.List<NumGroup> getNumGroup() {
            return this.numGroup;
        }

        public static final class Builder {
            private java.util.List<Num> num; 
            private java.util.List<NumGroup> numGroup; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.num = model.num;
                this.numGroup = model.numGroup;
            } 

            /**
             * <p>Caller number information.</p>
             */
            public Builder num(java.util.List<Num> num) {
                this.num = num;
                return this;
            }

            /**
             * <p>Number group information.</p>
             */
            public Builder numGroup(java.util.List<NumGroup> numGroup) {
                this.numGroup = numGroup;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
