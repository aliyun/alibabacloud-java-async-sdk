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
 * {@link ListCheckRuleInstanceRequest} extends {@link RequestModel}
 *
 * <p>ListCheckRuleInstanceRequest</p>
 */
public class ListCheckRuleInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceList")
    private java.util.List<InstanceList> instanceList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long ruleId;

    private ListCheckRuleInstanceRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.instanceList = builder.instanceList;
        this.pageSize = builder.pageSize;
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCheckRuleInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return instanceList
     */
    public java.util.List<InstanceList> getInstanceList() {
        return this.instanceList;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
    }

    public static final class Builder extends Request.Builder<ListCheckRuleInstanceRequest, Builder> {
        private Integer currentPage; 
        private java.util.List<InstanceList> instanceList; 
        private Integer pageSize; 
        private Long ruleId; 

        private Builder() {
            super();
        } 

        private Builder(ListCheckRuleInstanceRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.instanceList = request.instanceList;
            this.pageSize = request.pageSize;
            this.ruleId = request.ruleId;
        } 

        /**
         * <p>The page number of the current page when performing a paginated query.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Instance list.</p>
         */
        public Builder instanceList(java.util.List<InstanceList> instanceList) {
            this.putQueryParameter("InstanceList", instanceList);
            this.instanceList = instanceList;
            return this;
        }

        /**
         * <p>The maximum number of items per page in a paginated query. The default value is <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Rule ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/2590599.html">LisCheckRule</a> interface to get this parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder ruleId(Long ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        @Override
        public ListCheckRuleInstanceRequest build() {
            return new ListCheckRuleInstanceRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListCheckRuleInstanceRequest} extends {@link TeaModel}
     *
     * <p>ListCheckRuleInstanceRequest</p>
     */
    public static class InstanceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private InstanceList(Builder builder) {
            this.instanceId = builder.instanceId;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceList create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String instanceId; 
            private String regionId; 

            private Builder() {
            } 

            private Builder(InstanceList model) {
                this.instanceId = model.instanceId;
                this.regionId = model.regionId;
            } 

            /**
             * <p>Asset instance ID.</p>
             * <blockquote>
             * <p>Call the <a href="~~ListCheckInstanceResult~~">ListCheckInstanceResult</a> interface to get this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>i-wz9fdluqx20mp2x7****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The region where the asset is located.</p>
             * <blockquote>
             * <p>Call the <a href="~~ListCheckInstanceResult~~">ListCheckInstanceResult</a> interface to get this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cn-hongkong</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public InstanceList build() {
                return new InstanceList(this);
            } 

        } 

    }
}
