// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInterventionDictionaryRequest} extends {@link RequestModel}
 *
 * <p>CreateInterventionDictionaryRequest</p>
 */
public class CreateInterventionDictionaryRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("analyzerType")
    private String analyzerType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dryRun")
    private Boolean dryRun;

    private CreateInterventionDictionaryRequest(Builder builder) {
        super(builder);
        this.analyzerType = builder.analyzerType;
        this.name = builder.name;
        this.type = builder.type;
        this.dryRun = builder.dryRun;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInterventionDictionaryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return analyzerType
     */
    public String getAnalyzerType() {
        return this.analyzerType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public static final class Builder extends Request.Builder<CreateInterventionDictionaryRequest, Builder> {
        private String analyzerType; 
        private String name; 
        private String type; 
        private Boolean dryRun; 

        private Builder() {
            super();
        } 

        private Builder(CreateInterventionDictionaryRequest request) {
            super(request);
            this.analyzerType = request.analyzerType;
            this.name = request.name;
            this.type = request.type;
            this.dryRun = request.dryRun;
        } 

        /**
         * The type of the analyzer. Valid values:
         * <p>
         * 
         * *   MODEL: model-based custom analyzer.
         * *   SYSTEM: system analyzer.
         * *   USER: custom analyzer.
         */
        public Builder analyzerType(String analyzerType) {
            this.putBodyParameter("analyzerType", analyzerType);
            this.analyzerType = analyzerType;
            return this;
        }

        /**
         * The name of the intervention dictionary.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * The type of the intervention dictionary. Valid values:
         * <p>
         * 
         * *   stopword: an intervention dictionary for stop word filtering.
         * *   synonym: an intervention dictionary for synonym configuration.
         * *   correction: an intervention dictionary for spelling correction.
         * *   category_prediction: an intervention dictionary for category prediction.
         * *   ner: an intervention dictionary for named entity recognition (NER).
         * *   term_weighting: an intervention dictionary for term weight analysis.
         * *   suggest_allowlist: a drop-down suggestion whitelist.
         * *   suggest_denylist: a drop-down suggestion blacklist.
         * *   hot_allowlist: a top search whitelist.
         * *   hot_denylist: a top search blacklist.
         * *   hint_allowlist: a hint whitelist.
         * *   hint_denylist: a hint blacklist.
         */
        public Builder type(String type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * Specifies whether to perform only a dry run, without performing the actual request. Default value: false.
         * <p>
         * 
         * Valid values:
         * 
         * *   **true**
         * *   **false**
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("dryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        @Override
        public CreateInterventionDictionaryRequest build() {
            return new CreateInterventionDictionaryRequest(this);
        } 

    } 

}
