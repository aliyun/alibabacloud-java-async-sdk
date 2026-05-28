// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241111.models;

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
 * {@link MedicalAnswerInput} extends {@link TeaModel}
 *
 * <p>MedicalAnswerInput</p>
 */
public class MedicalAnswerInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("query")
    private String query;

    private MedicalAnswerInput(Builder builder) {
        this.query = builder.query;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MedicalAnswerInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    public static final class Builder {
        private String query; 

        private Builder() {
        } 

        private Builder(MedicalAnswerInput model) {
            this.query = model.query;
        } 

        /**
         * query.
         */
        public Builder query(String query) {
            this.query = query;
            return this;
        }

        public MedicalAnswerInput build() {
            return new MedicalAnswerInput(this);
        } 

    } 

}
