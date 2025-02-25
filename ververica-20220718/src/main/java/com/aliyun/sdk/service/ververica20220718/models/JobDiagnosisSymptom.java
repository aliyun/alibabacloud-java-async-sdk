// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

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
 * {@link JobDiagnosisSymptom} extends {@link TeaModel}
 *
 * <p>JobDiagnosisSymptom</p>
 */
public class JobDiagnosisSymptom extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("recommendation")
    private String recommendation;

    private JobDiagnosisSymptom(Builder builder) {
        this.description = builder.description;
        this.name = builder.name;
        this.recommendation = builder.recommendation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static JobDiagnosisSymptom create() {
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
     * @return recommendation
     */
    public String getRecommendation() {
        return this.recommendation;
    }

    public static final class Builder {
        private String description; 
        private String name; 
        private String recommendation; 

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * recommendation.
         */
        public Builder recommendation(String recommendation) {
            this.recommendation = recommendation;
            return this;
        }

        public JobDiagnosisSymptom build() {
            return new JobDiagnosisSymptom(this);
        } 

    } 

}
