// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeSimilarEventScenariosResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSimilarEventScenariosResponseBody</p>
 */
public class DescribeSimilarEventScenariosResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Scenarios")
    private java.util.List<Scenarios> scenarios;

    private DescribeSimilarEventScenariosResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.scenarios = builder.scenarios;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSimilarEventScenariosResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scenarios
     */
    public java.util.List<Scenarios> getScenarios() {
        return this.scenarios;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Scenarios> scenarios; 

        private Builder() {
        } 

        private Builder(DescribeSimilarEventScenariosResponseBody model) {
            this.requestId = model.requestId;
            this.scenarios = model.scenarios;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>FDF7B8D9-8493-4B90-8D13-E0C1FFCE5F97</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The scenarios in which alerts triggered by the same rule or rules of the same type are handled.</p>
         */
        public Builder scenarios(java.util.List<Scenarios> scenarios) {
            this.scenarios = scenarios;
            return this;
        }

        public DescribeSimilarEventScenariosResponseBody build() {
            return new DescribeSimilarEventScenariosResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSimilarEventScenariosResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSimilarEventScenariosResponseBody</p>
     */
    public static class Scenarios extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        private Scenarios(Builder builder) {
            this.code = builder.code;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Scenarios create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        public static final class Builder {
            private String code; 

            private Builder() {
            } 

            private Builder(Scenarios model) {
                this.code = model.code;
            } 

            /**
             * <p>The code of the scenario. Valid values:</p>
             * <ul>
             * <li><strong>default</strong>: the same alert type</li>
             * <li><strong>same_file_content</strong>: the same file content rule.</li>
             * <li><strong>same_ip</strong>: the same IP address rule.</li>
             * <li><strong>same_url</strong>: the same URL rule.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>same_url</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            public Scenarios build() {
                return new Scenarios(this);
            } 

        } 

    }
}
