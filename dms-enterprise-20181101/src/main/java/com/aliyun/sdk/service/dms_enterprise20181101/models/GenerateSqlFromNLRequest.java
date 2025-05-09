// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link GenerateSqlFromNLRequest} extends {@link RequestModel}
 *
 * <p>GenerateSqlFromNLRequest</p>
 */
public class GenerateSqlFromNLRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Dialect")
    private String dialect;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Knowledge")
    private String knowledge;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Level")
    private String level;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Model")
    private String model;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Question")
    @com.aliyun.core.annotation.Validation(required = true)
    private String question;

    private GenerateSqlFromNLRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dbId = builder.dbId;
        this.dialect = builder.dialect;
        this.knowledge = builder.knowledge;
        this.level = builder.level;
        this.model = builder.model;
        this.question = builder.question;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateSqlFromNLRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return dbId
     */
    public String getDbId() {
        return this.dbId;
    }

    /**
     * @return dialect
     */
    public String getDialect() {
        return this.dialect;
    }

    /**
     * @return knowledge
     */
    public String getKnowledge() {
        return this.knowledge;
    }

    /**
     * @return level
     */
    public String getLevel() {
        return this.level;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return question
     */
    public String getQuestion() {
        return this.question;
    }

    public static final class Builder extends Request.Builder<GenerateSqlFromNLRequest, Builder> {
        private String regionId; 
        private String dbId; 
        private String dialect; 
        private String knowledge; 
        private String level; 
        private String model; 
        private String question; 

        private Builder() {
            super();
        } 

        private Builder(GenerateSqlFromNLRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dbId = request.dbId;
            this.dialect = request.dialect;
            this.knowledge = request.knowledge;
            this.level = request.level;
            this.model = request.model;
            this.question = request.question;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1***</p>
         */
        public Builder dbId(String dbId) {
            this.putQueryParameter("DbId", dbId);
            this.dbId = dbId;
            return this;
        }

        /**
         * Dialect.
         */
        public Builder dialect(String dialect) {
            this.putQueryParameter("Dialect", dialect);
            this.dialect = dialect;
            return this;
        }

        /**
         * Knowledge.
         */
        public Builder knowledge(String knowledge) {
            this.putQueryParameter("Knowledge", knowledge);
            this.knowledge = knowledge;
            return this;
        }

        /**
         * Level.
         */
        public Builder level(String level) {
            this.putQueryParameter("Level", level);
            this.level = level;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(String model) {
            this.putQueryParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder question(String question) {
            this.putQueryParameter("Question", question);
            this.question = question;
            return this;
        }

        @Override
        public GenerateSqlFromNLRequest build() {
            return new GenerateSqlFromNLRequest(this);
        } 

    } 

}
