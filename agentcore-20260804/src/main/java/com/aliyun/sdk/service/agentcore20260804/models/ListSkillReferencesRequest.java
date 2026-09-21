// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link ListSkillReferencesRequest} extends {@link RequestModel}
 *
 * <p>ListSkillReferencesRequest</p>
 */
public class ListSkillReferencesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("skillName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String skillName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("selectorType")
    private String selectorType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("selectorValue")
    private String selectorValue;

    private ListSkillReferencesRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.skillName = builder.skillName;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.selectorType = builder.selectorType;
        this.selectorValue = builder.selectorValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSkillReferencesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return skillName
     */
    public String getSkillName() {
        return this.skillName;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return selectorType
     */
    public String getSelectorType() {
        return this.selectorType;
    }

    /**
     * @return selectorValue
     */
    public String getSelectorValue() {
        return this.selectorValue;
    }

    public static final class Builder extends Request.Builder<ListSkillReferencesRequest, Builder> {
        private String workspaceId; 
        private String skillName; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String selectorType; 
        private String selectorValue; 

        private Builder() {
            super();
        } 

        private Builder(ListSkillReferencesRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.skillName = request.skillName;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.selectorType = request.selectorType;
            this.selectorValue = request.selectorValue;
        } 

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The skill name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>customer-service-skill</p>
         */
        public Builder skillName(String skillName) {
            this.putPathParameter("skillName", skillName);
            this.skillName = skillName;
            return this;
        }

        /**
         * <p>The page number, starting from 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("pageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page. If this parameter is not specified, the server-side default value is used.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Filters results by reference selector type. Valid values: LABEL and VERSION.</p>
         * 
         * <strong>example:</strong>
         * <p>LABEL</p>
         */
        public Builder selectorType(String selectorType) {
            this.putQueryParameter("selectorType", selectorType);
            this.selectorType = selectorType;
            return this;
        }

        /**
         * <p>Filters results by reference selector value, such as latest, a named label, HEAD, or a specific version.</p>
         * 
         * <strong>example:</strong>
         * <p>HEAD</p>
         */
        public Builder selectorValue(String selectorValue) {
            this.putQueryParameter("selectorValue", selectorValue);
            this.selectorValue = selectorValue;
            return this;
        }

        @Override
        public ListSkillReferencesRequest build() {
            return new ListSkillReferencesRequest(this);
        } 

    } 

}
