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
 * {@link MetaAgentPreCheckParam} extends {@link TeaModel}
 *
 * <p>MetaAgentPreCheckParam</p>
 */
public class MetaAgentPreCheckParam extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DbIds")
    private String dbIds;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private String instanceIds;

    @com.aliyun.core.annotation.NameInMap("Supplement")
    private String supplement;

    @com.aliyun.core.annotation.NameInMap("TableNames")
    private String tableNames;

    private MetaAgentPreCheckParam(Builder builder) {
        this.dbIds = builder.dbIds;
        this.description = builder.description;
        this.instanceIds = builder.instanceIds;
        this.supplement = builder.supplement;
        this.tableNames = builder.tableNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MetaAgentPreCheckParam create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbIds
     */
    public String getDbIds() {
        return this.dbIds;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return supplement
     */
    public String getSupplement() {
        return this.supplement;
    }

    /**
     * @return tableNames
     */
    public String getTableNames() {
        return this.tableNames;
    }

    public static final class Builder {
        private String dbIds; 
        private String description; 
        private String instanceIds; 
        private String supplement; 
        private String tableNames; 

        private Builder() {
        } 

        private Builder(MetaAgentPreCheckParam model) {
            this.dbIds = model.dbIds;
            this.description = model.description;
            this.instanceIds = model.instanceIds;
            this.supplement = model.supplement;
            this.tableNames = model.tableNames;
        } 

        /**
         * DbIds.
         */
        public Builder dbIds(String dbIds) {
            this.dbIds = dbIds;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * InstanceIds.
         */
        public Builder instanceIds(String instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * Supplement.
         */
        public Builder supplement(String supplement) {
            this.supplement = supplement;
            return this;
        }

        /**
         * TableNames.
         */
        public Builder tableNames(String tableNames) {
            this.tableNames = tableNames;
            return this;
        }

        public MetaAgentPreCheckParam build() {
            return new MetaAgentPreCheckParam(this);
        } 

    } 

}
