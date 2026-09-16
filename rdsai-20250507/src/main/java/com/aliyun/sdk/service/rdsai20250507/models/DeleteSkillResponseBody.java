// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link DeleteSkillResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteSkillResponseBody</p>
 */
public class DeleteSkillResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CatalogRevision")
    private Long catalogRevision;

    @com.aliyun.core.annotation.NameInMap("Deleted")
    private Boolean deleted;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private String result;

    @com.aliyun.core.annotation.NameInMap("SkillId")
    private String skillId;

    private DeleteSkillResponseBody(Builder builder) {
        this.catalogRevision = builder.catalogRevision;
        this.deleted = builder.deleted;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.skillId = builder.skillId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSkillResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return catalogRevision
     */
    public Long getCatalogRevision() {
        return this.catalogRevision;
    }

    /**
     * @return deleted
     */
    public Boolean getDeleted() {
        return this.deleted;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public String getResult() {
        return this.result;
    }

    /**
     * @return skillId
     */
    public String getSkillId() {
        return this.skillId;
    }

    public static final class Builder {
        private Long catalogRevision; 
        private Boolean deleted; 
        private String requestId; 
        private String result; 
        private String skillId; 

        private Builder() {
        } 

        private Builder(DeleteSkillResponseBody model) {
            this.catalogRevision = model.catalogRevision;
            this.deleted = model.deleted;
            this.requestId = model.requestId;
            this.result = model.result;
            this.skillId = model.skillId;
        } 

        /**
         * <p>The Skill catalog revision number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder catalogRevision(Long catalogRevision) {
            this.catalogRevision = catalogRevision;
            return this;
        }

        /**
         * <p>Indicates whether the Skill is deleted.</p>
         */
        public Builder deleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }

        /**
         * <p>The unique identifier of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned result.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder result(String result) {
            this.result = result;
            return this;
        }

        /**
         * <p>The ID of the deleted Skill.</p>
         * 
         * <strong>example:</strong>
         * <p>skill-example</p>
         */
        public Builder skillId(String skillId) {
            this.skillId = skillId;
            return this;
        }

        public DeleteSkillResponseBody build() {
            return new DeleteSkillResponseBody(this);
        } 

    } 

}
