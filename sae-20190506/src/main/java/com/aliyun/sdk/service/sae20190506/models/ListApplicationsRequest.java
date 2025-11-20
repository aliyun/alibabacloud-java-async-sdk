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
 * {@link ListApplicationsRequest} extends {@link RequestModel}
 *
 * <p>ListApplicationsRequest</p>
 */
public class ListApplicationsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppSource")
    private String appSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FieldType")
    private String fieldType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FieldValue")
    private String fieldValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsStateful")
    private String isStateful;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    private String namespaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Reverse")
    private Boolean reverse;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private String tags;

    private ListApplicationsRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.appSource = builder.appSource;
        this.currentPage = builder.currentPage;
        this.fieldType = builder.fieldType;
        this.fieldValue = builder.fieldValue;
        this.isStateful = builder.isStateful;
        this.namespaceId = builder.namespaceId;
        this.orderBy = builder.orderBy;
        this.pageSize = builder.pageSize;
        this.reverse = builder.reverse;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return appSource
     */
    public String getAppSource() {
        return this.appSource;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return fieldType
     */
    public String getFieldType() {
        return this.fieldType;
    }

    /**
     * @return fieldValue
     */
    public String getFieldValue() {
        return this.fieldValue;
    }

    /**
     * @return isStateful
     */
    public String getIsStateful() {
        return this.isStateful;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
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

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<ListApplicationsRequest, Builder> {
        private String appName; 
        private String appSource; 
        private Integer currentPage; 
        private String fieldType; 
        private String fieldValue; 
        private String isStateful; 
        private String namespaceId; 
        private String orderBy; 
        private Integer pageSize; 
        private Boolean reverse; 
        private String tags; 

        private Builder() {
            super();
        } 

        private Builder(ListApplicationsRequest request) {
            super(request);
            this.appName = request.appName;
            this.appSource = request.appSource;
            this.currentPage = request.currentPage;
            this.fieldType = request.fieldType;
            this.fieldValue = request.fieldValue;
            this.isStateful = request.isStateful;
            this.namespaceId = request.namespaceId;
            this.orderBy = request.orderBy;
            this.pageSize = request.pageSize;
            this.reverse = request.reverse;
            this.tags = request.tags;
        } 

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>demo-app</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>The SAE application type. Valid values:</p>
         * <ul>
         * <li><strong>micro_service</strong></li>
         * <li><strong>web</strong></li>
         * <li><strong>job</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>micro_service</p>
         */
        public Builder appSource(String appSource) {
            this.putQueryParameter("AppSource", appSource);
            this.appSource = appSource;
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
         * <p>Set the filtering criteria for applications. The value options are as follows:</p>
         * <ul>
         * <li>appName: Application name.</li>
         * <li>appIds: Application IDs.</li>
         * <li>slbIps: SLB IP addresses.</li>
         * <li>instanceIps: Instance IP addresses.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>appName</p>
         */
        public Builder fieldType(String fieldType) {
            this.putQueryParameter("FieldType", fieldType);
            this.fieldType = fieldType;
            return this;
        }

        /**
         * <p>The name, ID, SLB IP, or instance IP of the target application.</p>
         * 
         * <strong>example:</strong>
         * <p>demo-app</p>
         */
        public Builder fieldValue(String fieldValue) {
            this.putQueryParameter("FieldValue", fieldValue);
            this.fieldValue = fieldValue;
            return this;
        }

        /**
         * IsStateful.
         */
        public Builder isStateful(String isStateful) {
            this.putQueryParameter("IsStateful", isStateful);
            this.isStateful = isStateful;
            return this;
        }

        /**
         * <p>The namespace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing:demo</p>
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * <p>Specifies how applications are sorted. Valid values:</p>
         * <ul>
         * <li><strong>running</strong>: The applications are sorted based on the number of running instances.</li>
         * <li><strong>instances</strong>: The applications are sorted based on the number of destination instances.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>The number of records in each page. Value range: [0,10000]</p>
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
         * <p>Sort by the running status of application instances. If the statuses are the same, sort by instance ID. The value options are as follows:</p>
         * <ul>
         * <li>true: Sort in ascending order. Instances are arranged according to the startup process, for example: to ultimately reach the running state, an instance must first go through steps such as starting containers, pulling images, and initializing the instance.</li>
         * <li>false: Sort in descending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder reverse(Boolean reverse) {
            this.putQueryParameter("Reverse", reverse);
            this.reverse = reverse;
            return this;
        }

        /**
         * <p>The tag in the format of a key-value pair.</p>
         * <ul>
         * <li><strong>key</strong>: the tag key. It cannot exceed 128 characters in length.</li>
         * <li><strong>value</strong>: the tag value. It cannot exceed 128 characters in length.</li>
         * </ul>
         * <p>Tag keys and tag values are case-sensitive. If you specify multiple tags, the system adds all the tags to the specified resources. Each tag key on a resource can have only one tag value. If you create a tag that has the same key as an existing tag, the value of the existing tag is overwritten.</p>
         * <p>Tag keys and tag values cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;key&quot;:&quot;key&quot;,&quot;value&quot;:&quot;value&quot;}]</p>
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public ListApplicationsRequest build() {
            return new ListApplicationsRequest(this);
        } 

    } 

}
