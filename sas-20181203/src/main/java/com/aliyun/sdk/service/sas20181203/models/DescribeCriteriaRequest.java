// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeCriteriaRequest} extends {@link RequestModel}
 *
 * <p>DescribeCriteriaRequest</p>
 */
public class DescribeCriteriaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MachineTypes")
    private String machineTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SupportAutoTag")
    private Boolean supportAutoTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Value")
    private String value;

    private DescribeCriteriaRequest(Builder builder) {
        super(builder);
        this.machineTypes = builder.machineTypes;
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
        this.supportAutoTag = builder.supportAutoTag;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCriteriaRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return machineTypes
     */
    public String getMachineTypes() {
        return this.machineTypes;
    }

    /**
     * @return resourceDirectoryAccountId
     */
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    /**
     * @return supportAutoTag
     */
    public Boolean getSupportAutoTag() {
        return this.supportAutoTag;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder extends Request.Builder<DescribeCriteriaRequest, Builder> {
        private String machineTypes; 
        private Long resourceDirectoryAccountId; 
        private Boolean supportAutoTag; 
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCriteriaRequest request) {
            super(request);
            this.machineTypes = request.machineTypes;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.supportAutoTag = request.supportAutoTag;
            this.value = request.value;
        } 

        /**
         * <p>The Asset Type to query. Valid values:</p>
         * <ul>
         * <li><strong>ecs</strong>: queries all ECS servers.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        public Builder machineTypes(String machineTypes) {
            this.putQueryParameter("MachineTypes", machineTypes);
            this.machineTypes = machineTypes;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account of the member accounts in the resource folder.</p>
         * <blockquote>
         * <p>Invoke the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>127608589417****</p>
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * <p>Specifies whether the fuzzy query field supports automatic matching. Default value: <strong>false</strong>. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Supported.</li>
         * <li><strong>false</strong>: Not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder supportAutoTag(Boolean supportAutoTag) {
            this.putQueryParameter("SupportAutoTag", supportAutoTag);
            this.supportAutoTag = supportAutoTag;
            return this;
        }

        /**
         * <p>The fuzzy match value entered when querying assets.</p>
         * 
         * <strong>example:</strong>
         * <p>47.96</p>
         */
        public Builder value(String value) {
            this.putQueryParameter("Value", value);
            this.value = value;
            return this;
        }

        @Override
        public DescribeCriteriaRequest build() {
            return new DescribeCriteriaRequest(this);
        } 

    } 

}
