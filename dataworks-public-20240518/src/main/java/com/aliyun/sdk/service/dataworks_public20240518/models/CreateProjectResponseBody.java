// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link CreateProjectResponseBody} extends {@link TeaModel}
 *
 * <p>CreateProjectResponseBody</p>
 */
public class CreateProjectResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @Deprecated
    private Long projectId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateProjectResponseBody(Builder builder) {
        this.id = builder.id;
        this.projectId = builder.projectId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProjectResponseBody create() {
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
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long id; 
        private Long projectId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateProjectResponseBody model) {
            this.id = model.id;
            this.projectId = model.projectId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The workspace ID. Note: This parameter is deprecated and is replaced by the Id parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder projectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AFBB799F-8578-51C5-A766-E922EDB8XXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateProjectResponseBody build() {
            return new CreateProjectResponseBody(this);
        } 

    } 

}
