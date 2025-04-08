// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link GetDoctorApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>GetDoctorApplicationResponseBody</p>
 */
public class GetDoctorApplicationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    private GetDoctorApplicationResponseBody(Builder builder) {
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDoctorApplicationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    public static final class Builder {
        private Data data; 

        private Builder() {
        } 

        private Builder(GetDoctorApplicationResponseBody model) {
            this.data = model.data;
        } 

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        public GetDoctorApplicationResponseBody build() {
            return new GetDoctorApplicationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDoctorApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>GetDoctorApplicationResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("suggestions")
        private java.util.List<String> suggestions;

        private Data(Builder builder) {
            this.suggestions = builder.suggestions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return suggestions
         */
        public java.util.List<String> getSuggestions() {
            return this.suggestions;
        }

        public static final class Builder {
            private java.util.List<String> suggestions; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.suggestions = model.suggestions;
            } 

            /**
             * <p>The diagnostics list.</p>
             */
            public Builder suggestions(java.util.List<String> suggestions) {
                this.suggestions = suggestions;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
