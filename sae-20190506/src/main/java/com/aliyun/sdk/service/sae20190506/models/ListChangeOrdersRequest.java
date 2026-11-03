// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link ListChangeOrdersRequest} extends {@link RequestModel}
 *
 * <p>ListChangeOrdersRequest</p>
 */
public class ListChangeOrdersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CoStatus")
    private String coStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CoType")
    private String coType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Key")
    private String key;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Reverse")
    private Boolean reverse;

    private ListChangeOrdersRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.coStatus = builder.coStatus;
        this.coType = builder.coType;
        this.currentPage = builder.currentPage;
        this.key = builder.key;
        this.orderBy = builder.orderBy;
        this.pageSize = builder.pageSize;
        this.reverse = builder.reverse;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListChangeOrdersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return coStatus
     */
    public String getCoStatus() {
        return this.coStatus;
    }

    /**
     * @return coType
     */
    public String getCoType() {
        return this.coType;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return reverse
     */
    public Boolean getReverse() {
        return this.reverse;
    }

    public static final class Builder extends Request.Builder<ListChangeOrdersRequest, Builder> {
        private String appId; 
        private String coStatus; 
        private String coType; 
        private Integer currentPage; 
        private String key; 
        private String orderBy; 
        private Integer pageSize; 
        private Boolean reverse; 

        private Builder() {
            super();
        } 

        private Builder(ListChangeOrdersRequest request) {
            super(request);
            this.appId = request.appId;
            this.coStatus = request.coStatus;
            this.coType = request.coType;
            this.currentPage = request.currentPage;
            this.key = request.key;
            this.orderBy = request.orderBy;
            this.pageSize = request.pageSize;
            this.reverse = request.reverse;
        } 

        /**
         * <p>The application ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>145341c-9708-4967-b3ec-24933767****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The status of the change order. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: preparing</li>
         * <li><strong>1</strong>: executing</li>
         * <li><strong>2</strong>: executed successfully</li>
         * <li><strong>3</strong>: execution failed</li>
         * <li><strong>6</strong>: terminated</li>
         * <li><strong>8</strong>: waiting for manual batch confirmation</li>
         * <li><strong>9</strong>: waiting for automatic batch confirmation</li>
         * <li><strong>10</strong>: execution failed due to a system exception</li>
         * <li><strong>11</strong>: waiting for approval</li>
         * <li><strong>12</strong>: approved and waiting for execution</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder coStatus(String coStatus) {
            this.putQueryParameter("CoStatus", coStatus);
            this.coStatus = coStatus;
            return this;
        }

        /**
         * <p>The type of the change order. Valid values:</p>
         * <ul>
         * <li><strong>CoBindSlb</strong>: bind an SLB instance</li>
         * <li><strong>CoUnbindSlb</strong>: unbind an SLB instance</li>
         * <li><strong>CoCreateApp</strong>: create an application</li>
         * <li><strong>CoDeleteApp</strong>: delete an application</li>
         * <li><strong>CoDeploy</strong>: deploy an application</li>
         * <li><strong>CoRestartApplication</strong>: restart an application</li>
         * <li><strong>CoRollback</strong>: roll back an application</li>
         * <li><strong>CoScaleIn</strong>: scale in an application</li>
         * <li><strong>CoScaleOut</strong>: scale out an application</li>
         * <li><strong>CoStartApplication</strong>: start an application</li>
         * <li><strong>CoStopApplication</strong>: stop an application</li>
         * <li><strong>CoRescaleApplicationVertically</strong>: change instance specifications</li>
         * <li><strong>CoDeployHistroy</strong>: roll back to a historical version</li>
         * <li><strong>CoBindNas</strong>: bind a NAS file system</li>
         * <li><strong>CoUnbindNas</strong>: unbind a NAS file system</li>
         * <li><strong>CoBatchStartApplication</strong>: start applications in batches</li>
         * <li><strong>CoBatchStopApplication</strong>: stop applications in batches</li>
         * <li><strong>CoRestartInstances</strong>: restart instances</li>
         * <li><strong>CoDeleteInstances</strong>: delete instances</li>
         * <li><strong>CoScaleInAppWithInstances</strong>: scale in specified instances</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CoCreateApp</p>
         */
        public Builder coType(String coType) {
            this.putQueryParameter("CoType", coType);
            this.coType = coType;
            return this;
        }

        /**
         * <p>The current page number.</p>
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
         * <p>The keyword used for fuzzy match of the change order description. Change orders whose descriptions contain the keyword are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder key(String key) {
            this.putQueryParameter("Key", key);
            this.key = key;
            return this;
        }

        /**
         * <p>The sorting condition.</p>
         * 
         * <strong>example:</strong>
         * <p>create_time</p>
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
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
         * <p>Specifies whether to sort the results in ascending order based on the field specified by the <strong>OrderBy</strong> parameter. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: sort in ascending order</li>
         * <li><strong>false</strong>: sort in descending order</li>
         * </ul>
         */
        public Builder reverse(Boolean reverse) {
            this.putQueryParameter("Reverse", reverse);
            this.reverse = reverse;
            return this;
        }

        @Override
        public ListChangeOrdersRequest build() {
            return new ListChangeOrdersRequest(this);
        } 

    } 

}
