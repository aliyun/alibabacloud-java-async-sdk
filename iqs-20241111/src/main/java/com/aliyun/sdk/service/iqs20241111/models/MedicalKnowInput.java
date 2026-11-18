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
         * <p>The medical, drug, disease, or food entity whose properties are to be queried.</p>
         * 
         * <strong>example:</strong>
         * <p>Amoxicillin Capsules</p>
         */
        public Builder query(String query) {
            this.query = query;
            return this;
        }

        /**
         * <p>The entity query type. Valid values:</p>
         * <ul>
         * <li>finding: disease</li>
         * <li>food: food</li>
         * <li>medicine: medicine
         * If this parameter is not specified, the type is automatically identified.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>medicine</p>
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
