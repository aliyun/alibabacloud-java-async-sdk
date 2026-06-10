// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

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
 * {@link GetSkillResponseBody} extends {@link TeaModel}
 *
 * <p>GetSkillResponseBody</p>
 */
public class GetSkillResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SkillDescription")
    private String skillDescription;

    @com.aliyun.core.annotation.NameInMap("SkillId")
    private String skillId;

    @com.aliyun.core.annotation.NameInMap("SkillLabels")
    private java.util.List<String> skillLabels;

    @com.aliyun.core.annotation.NameInMap("SkillName")
    private String skillName;

    @com.aliyun.core.annotation.NameInMap("SkillSpaceId")
    private String skillSpaceId;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    private GetSkillResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.requestId = builder.requestId;
        this.skillDescription = builder.skillDescription;
        this.skillId = builder.skillId;
        this.skillLabels = builder.skillLabels;
        this.skillName = builder.skillName;
        this.skillSpaceId = builder.skillSpaceId;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSkillResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return skillDescription
     */
    public String getSkillDescription() {
        return this.skillDescription;
    }

    /**
     * @return skillId
     */
    public String getSkillId() {
        return this.skillId;
    }

    /**
     * @return skillLabels
     */
    public java.util.List<String> getSkillLabels() {
        return this.skillLabels;
    }

    /**
     * @return skillName
     */
    public String getSkillName() {
        return this.skillName;
    }

    /**
     * @return skillSpaceId
     */
    public String getSkillSpaceId() {
        return this.skillSpaceId;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private String createTime; 
        private String requestId; 
        private String skillDescription; 
        private String skillId; 
        private java.util.List<String> skillLabels; 
        private String skillName; 
        private String skillSpaceId; 
        private String updateTime; 

        private Builder() {
        } 

        private Builder(GetSkillResponseBody model) {
            this.createTime = model.createTime;
            this.requestId = model.requestId;
            this.skillDescription = model.skillDescription;
            this.skillId = model.skillId;
            this.skillLabels = model.skillLabels;
            this.skillName = model.skillName;
            this.skillSpaceId = model.skillSpaceId;
            this.updateTime = model.updateTime;
        } 

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>13FE89A5-C036-56BF-A0FF-A31C59819FD7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SkillDescription.
         */
        public Builder skillDescription(String skillDescription) {
            this.skillDescription = skillDescription;
            return this;
        }

        /**
         * <p>Skill ID</p>
         * 
         * <strong>example:</strong>
         * <p>s-04zzrgosj6xd11yah</p>
         */
        public Builder skillId(String skillId) {
            this.skillId = skillId;
            return this;
        }

        /**
         * SkillLabels.
         */
        public Builder skillLabels(java.util.List<String> skillLabels) {
            this.skillLabels = skillLabels;
            return this;
        }

        /**
         * SkillName.
         */
        public Builder skillName(String skillName) {
            this.skillName = skillName;
            return this;
        }

        /**
         * SkillSpaceId.
         */
        public Builder skillSpaceId(String skillSpaceId) {
            this.skillSpaceId = skillSpaceId;
            return this;
        }

        /**
         * UpdateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public GetSkillResponseBody build() {
            return new GetSkillResponseBody(this);
        } 

    } 

}
