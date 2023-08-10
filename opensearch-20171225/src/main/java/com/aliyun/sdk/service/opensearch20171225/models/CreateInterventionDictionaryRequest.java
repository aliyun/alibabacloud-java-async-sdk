// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInterventionDictionaryRequest} extends {@link RequestModel}
 *
 * <p>CreateInterventionDictionaryRequest</p>
 */
public class CreateInterventionDictionaryRequest extends Request {
    @Body
    @NameInMap("analyzerType")
    private String analyzerType;

    @Body
    @NameInMap("name")
    private String name;

    @Body
    @NameInMap("type")
    private String type;

    @Query
    @NameInMap("dryRun")
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
         * analyzerType.
         */
        public Builder analyzerType(String analyzerType) {
            this.putBodyParameter("analyzerType", analyzerType);
            this.analyzerType = analyzerType;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * dryRun.
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
