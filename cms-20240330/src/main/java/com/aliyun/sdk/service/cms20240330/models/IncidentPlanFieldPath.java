// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link IncidentPlanFieldPath} extends {@link TeaModel}
 *
 * <p>IncidentPlanFieldPath</p>
 */
public class IncidentPlanFieldPath extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("fieldAlias")
    private String fieldAlias;

    @com.aliyun.core.annotation.NameInMap("fieldPath")
    private java.util.List<String> fieldPath;

    private IncidentPlanFieldPath(Builder builder) {
        this.fieldAlias = builder.fieldAlias;
        this.fieldPath = builder.fieldPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IncidentPlanFieldPath create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fieldAlias
     */
    public String getFieldAlias() {
        return this.fieldAlias;
    }

    /**
     * @return fieldPath
     */
    public java.util.List<String> getFieldPath() {
        return this.fieldPath;
    }

    public static final class Builder {
        private String fieldAlias; 
        private java.util.List<String> fieldPath; 

        private Builder() {
        } 

        private Builder(IncidentPlanFieldPath model) {
            this.fieldAlias = model.fieldAlias;
            this.fieldPath = model.fieldPath;
        } 

        /**
         * fieldAlias.
         */
        public Builder fieldAlias(String fieldAlias) {
            this.fieldAlias = fieldAlias;
            return this;
        }

        /**
         * fieldPath.
         */
        public Builder fieldPath(java.util.List<String> fieldPath) {
            this.fieldPath = fieldPath;
            return this;
        }

        public IncidentPlanFieldPath build() {
            return new IncidentPlanFieldPath(this);
        } 

    } 

}
