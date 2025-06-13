// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link ListEnterpriseAccelerateTargetsRequest} extends {@link RequestModel}
 *
 * <p>ListEnterpriseAccelerateTargetsRequest</p>
 */
public class ListEnterpriseAccelerateTargetsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 10000, minimum = 1)
    private Long currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EapId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eapId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 1000, minimum = 1)
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Target")
    private String target;

    private ListEnterpriseAccelerateTargetsRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.eapId = builder.eapId;
        this.pageSize = builder.pageSize;
        this.target = builder.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEnterpriseAccelerateTargetsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Long getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return eapId
     */
    public String getEapId() {
        return this.eapId;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return target
     */
    public String getTarget() {
        return this.target;
    }

    public static final class Builder extends Request.Builder<ListEnterpriseAccelerateTargetsRequest, Builder> {
        private Long currentPage; 
        private String eapId; 
        private Long pageSize; 
        private String target; 

        private Builder() {
            super();
        } 

        private Builder(ListEnterpriseAccelerateTargetsRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.eapId = request.eapId;
            this.pageSize = request.pageSize;
            this.target = request.target;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Long currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eap-424ba3f47660425c</p>
         */
        public Builder eapId(String eapId) {
            this.putQueryParameter("EapId", eapId);
            this.eapId = eapId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Target.
         */
        public Builder target(String target) {
            this.putQueryParameter("Target", target);
            this.target = target;
            return this;
        }

        @Override
        public ListEnterpriseAccelerateTargetsRequest build() {
            return new ListEnterpriseAccelerateTargetsRequest(this);
        } 

    } 

}
