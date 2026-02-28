// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link ListDeviceDistributeJobRequest} extends {@link RequestModel}
 *
 * <p>ListDeviceDistributeJobRequest</p>
 */
public class ListDeviceDistributeJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    private String productKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetUid")
    private String targetUid;

    private ListDeviceDistributeJobRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.jobId = builder.jobId;
        this.nextToken = builder.nextToken;
        this.pageSize = builder.pageSize;
        this.productKey = builder.productKey;
        this.status = builder.status;
        this.targetUid = builder.targetUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeviceDistributeJobRequest create() {
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
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return targetUid
     */
    public String getTargetUid() {
        return this.targetUid;
    }

    public static final class Builder extends Request.Builder<ListDeviceDistributeJobRequest, Builder> {
        private Integer currentPage; 
        private String jobId; 
        private String nextToken; 
        private Integer pageSize; 
        private String productKey; 
        private Integer status; 
        private String targetUid; 

        private Builder() {
            super();
        } 

        private Builder(ListDeviceDistributeJobRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.jobId = request.jobId;
            this.nextToken = request.nextToken;
            this.pageSize = request.pageSize;
            this.productKey = request.productKey;
            this.status = request.status;
            this.targetUid = request.targetUid;
        } 

        /**
         * <p>The number of the page to return. Default value: 1.</p>
         * <p>The <strong>NextToken</strong> or <strong>CurrentPage</strong> parameter specifies a condition for displaying the results. You can specify one of the two parameters. If you specify both parameters at the same time, the <strong>NextToken parameter</strong> is used.</p>
         * <p>For information about the <strong>NextToken</strong> parameter, see the description of the <strong>NextToken</strong> parameter.</p>
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
         * <p>The ID of the distribution task. The ID is globally unique.</p>
         * 
         * <strong>example:</strong>
         * <p>UbmsMHmkqv0PiAG****010001</p>
         */
        public Builder jobId(String jobId) {
            this.putBodyParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The token that is used to retrieve subsequent pages of the query results. The first time you perform a query operation, you do not need to specify this parameter.</p>
         * <p>The <strong>NextToken</strong> or <strong>CurrentPage</strong> parameter specifies a condition for displaying the results. You can specify one of the two parameters. If you specify both parameters at the same time, the <strong>NextToken</strong> parameter is used.</p>
         * <p><strong>Important</strong></p>
         * <p>The offset in the number of results is obtained by using the following formula: <strong>PageSize</strong> × (<strong>CurrentPage</strong> - 1).</p>
         * <p>If the offset is greater than 10,000, you must use the token that is returned in the previous query as the value of the <strong>NextToken</strong> parameter to obtain the value of the <strong>Data</strong> parameter. Otherwise, the current request is terminated and the value of the <strong>Data</strong> parameter cannot be returned.</p>
         * 
         * <strong>example:</strong>
         * <p>TGlzdFJlc291***</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Valid values: 1 to 200.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The <strong>ProductKey</strong> of the product to which the device belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>a1T27vz****</p>
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * <p>The status of the device distribution task.</p>
         * <ul>
         * <li><strong>0</strong>: The task is being initialized.</li>
         * <li><strong>1</strong>: The task is running.</li>
         * <li><strong>2</strong>: The task is completed. The status indicates that the distribution task is complete but does not indicate that all products and devices are distributed. To obtain distribution results, call the <a href="https://help.aliyun.com/document_detail/199533.html">QueryDeviceDistributeDetail</a> operation.</li>
         * <li><strong>3</strong>: The task is unexpectedly interrupted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account to which the devices are distributed.</p>
         * 
         * <strong>example:</strong>
         * <p>198***</p>
         */
        public Builder targetUid(String targetUid) {
            this.putQueryParameter("TargetUid", targetUid);
            this.targetUid = targetUid;
            return this;
        }

        @Override
        public ListDeviceDistributeJobRequest build() {
            return new ListDeviceDistributeJobRequest(this);
        } 

    } 

}
