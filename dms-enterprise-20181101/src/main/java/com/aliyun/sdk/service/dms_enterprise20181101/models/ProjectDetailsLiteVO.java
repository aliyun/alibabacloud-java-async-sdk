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
 * {@link ProjectDetailsLiteVO} extends {@link TeaModel}
 *
 * <p>ProjectDetailsLiteVO</p>
 */
public class ProjectDetailsLiteVO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("ProjectName")
    private String projectName;

    private ProjectDetailsLiteVO(Builder builder) {
        this.id = builder.id;
        this.projectName = builder.projectName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ProjectDetailsLiteVO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    public static final class Builder {
        private Long id; 
        private String projectName; 

        private Builder() {
        } 

        private Builder(ProjectDetailsLiteVO model) {
            this.id = model.id;
            this.projectName = model.projectName;
        } 

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.projectName = projectName;
            return this;
        }

        public ProjectDetailsLiteVO build() {
            return new ProjectDetailsLiteVO(this);
        } 

    } 

}
