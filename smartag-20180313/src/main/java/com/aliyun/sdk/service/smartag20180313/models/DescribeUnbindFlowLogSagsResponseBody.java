// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link DescribeUnbindFlowLogSagsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUnbindFlowLogSagsResponseBody</p>
 */
public class DescribeUnbindFlowLogSagsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Sags")
    private Sags sags;

    private DescribeUnbindFlowLogSagsResponseBody(Builder builder) {
        this.count = builder.count;
        this.requestId = builder.requestId;
        this.sags = builder.sags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUnbindFlowLogSagsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sags
     */
    public Sags getSags() {
        return this.sags;
    }

    public static final class Builder {
        private Integer count; 
        private String requestId; 
        private Sags sags; 

        private Builder() {
        } 

        private Builder(DescribeUnbindFlowLogSagsResponseBody model) {
            this.count = model.count;
            this.requestId = model.requestId;
            this.sags = model.sags;
        } 

        /**
         * <p>The total number of the SAG instances.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C850C10E-9856-45FF-8640-80288BA467DF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of the SAG instances.</p>
         */
        public Builder sags(Sags sags) {
            this.sags = sags;
            return this;
        }

        public DescribeUnbindFlowLogSagsResponseBody build() {
            return new DescribeUnbindFlowLogSagsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUnbindFlowLogSagsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUnbindFlowLogSagsResponseBody</p>
     */
    public static class Sag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SmartAGId")
        private String smartAGId;

        private Sag(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.smartAGId = builder.smartAGId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sag create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return smartAGId
         */
        public String getSmartAGId() {
            return this.smartAGId;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String smartAGId; 

            private Builder() {
            } 

            private Builder(Sag model) {
                this.description = model.description;
                this.name = model.name;
                this.smartAGId = model.smartAGId;
            } 

            /**
             * <p>The description of the SAG instance.</p>
             * 
             * <strong>example:</strong>
             * <p>desctest</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the SAG instance.</p>
             * 
             * <strong>example:</strong>
             * <p>sj1000-yf-01</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the SAG instance.</p>
             * 
             * <strong>example:</strong>
             * <p>sag-tzirqx07bvcngm****</p>
             */
            public Builder smartAGId(String smartAGId) {
                this.smartAGId = smartAGId;
                return this;
            }

            public Sag build() {
                return new Sag(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeUnbindFlowLogSagsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUnbindFlowLogSagsResponseBody</p>
     */
    public static class Sags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Sag")
        private java.util.List<Sag> sag;

        private Sags(Builder builder) {
            this.sag = builder.sag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sags create() {
            return builder().build();
        }

        /**
         * @return sag
         */
        public java.util.List<Sag> getSag() {
            return this.sag;
        }

        public static final class Builder {
            private java.util.List<Sag> sag; 

            private Builder() {
            } 

            private Builder(Sags model) {
                this.sag = model.sag;
            } 

            /**
             * Sag.
             */
            public Builder sag(java.util.List<Sag> sag) {
                this.sag = sag;
                return this;
            }

            public Sags build() {
                return new Sags(this);
            } 

        } 

    }
}
