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
 * {@link MedicalKnowInput} extends {@link TeaModel}
 *
 * <p>MedicalKnowInput</p>
 */
public class MedicalKnowInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("query")
    private String query;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private MedicalKnowInput(Builder builder) {
        this.query = builder.query;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MedicalKnowInput create() {
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

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String query; 
        private String type; 

        private Builder() {
        } 

        private Builder(MedicalKnowInput model) {
            this.query = model.query;
            this.type = model.type;
        } 

        /**
         * query.
         */
        public Builder query(String query) {
            this.query = query;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public MedicalKnowInput build() {
            return new MedicalKnowInput(this);
        } 

    } 

}
