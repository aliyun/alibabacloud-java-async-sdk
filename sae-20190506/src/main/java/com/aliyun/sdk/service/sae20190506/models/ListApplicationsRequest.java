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
    @com.aliyun.core.annotation.NameInMap("NewSaeVersion")
    private String newSaeVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProgrammingLanguage")
    private String programmingLanguage;

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
        this.newSaeVersion = builder.newSaeVersion;
        this.orderBy = builder.orderBy;
        this.pageSize = builder.pageSize;
        this.programmingLanguage = builder.programmingLanguage;
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
     * @return newSaeVersion
     */
    public String getNewSaeVersion() {
        return this.newSaeVersion;
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
     * @return programmingLanguage
     */
    public String getProgrammingLanguage() {
        return this.programmingLanguage;
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
        private String newSaeVersion; 
        private String orderBy; 
        private Integer pageSize; 
        private String programmingLanguage; 
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
            this.newSaeVersion = request.newSaeVersion;
            this.orderBy = request.orderBy;
            this.pageSize = request.pageSize;
            this.programmingLanguage = request.programmingLanguage;
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
         * <p>The Serverless App Engine (SAE) application type.</p>
         * <ul>
         * <li><strong>micro_service.</strong></li>
         * <li><strong>web.</strong></li>
         * <li><strong>job.</strong></li>
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
         * <p>The dimension by which to filter applications. Valid values:</p>
         * <ul>
         * <li><strong>appName</strong>: application name.</li>
         * <li><strong>appIds</strong>: application ID.</li>
         * <li><strong>slbIps</strong>: SLB IP address.</li>
         * <li><strong>instanceIps</strong>: instance IP address.</li>
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
         * <p>The application name, application ID, SLB IP address, or instance IP address of the target application.</p>
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
         * <p>Specifies whether the application is stateful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
         * <p>The application version. Valid values:</p>
         * <ul>
         * <li>lite: Lite Edition</li>
         * <li>std: Standard Edition</li>
         * <li>pro: Professional Edition</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pro</p>
         */
        public Builder newSaeVersion(String newSaeVersion) {
            this.putQueryParameter("NewSaeVersion", newSaeVersion);
            this.newSaeVersion = newSaeVersion;
            return this;
        }

        /**
         * <p>The field by which to sort applications. Valid values:</p>
         * <ul>
         * <li><strong>runnings</strong>: sorts by the current number target instances.</li>
         * <li><strong>instances</strong>: sorts by the target number target instances.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>runnings</p>
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>The number of entries per page in a paging query. Valid values: [0,10000].</p>
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
         * ProgrammingLanguage.
         */
        public Builder programmingLanguage(String programmingLanguage) {
            this.putQueryParameter("ProgrammingLanguage", programmingLanguage);
            this.programmingLanguage = programmingLanguage;
            return this;
        }

        /**
         * <p>Specifies whether to sort application instances by running status. If instances have the same status, they are sorted by instance ID. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: sorts in ascending order. Instances are arranged based on the startup sequence. For example, to reach the running state, an instance must go through steps such as starting the container, pulling the image, and initializing the instance.</li>
         * <li><strong>false</strong>: sorts in descending order.</li>
         * </ul>
         * <p>The ascending order of instances is as follows:</p>
         * <ol>
         * <li><strong>Error</strong>: an error occurred during instance startup.</li>
         * <li><strong>CrashLoopBackOff</strong>: the container failed to start, encountered an error during startup, and encountered an error again after restart.</li>
         * <li><strong>ErrImagePull</strong>: an error occurred while pulling the container image for the instance.</li>
         * <li><strong>ImagePullBackOff</strong>: the container image cannot be obtained.</li>
         * <li><strong>Pending</strong>: the instance is waiting to be scheduled.</li>
         * <li><strong>Unknown</strong>: an unknown exception occurred.</li>
         * <li><strong>Terminating</strong>: the instance is being terminated.</li>
         * <li><strong>NotFound</strong>: the instance cannot be found.</li>
         * <li><strong>PodInitializing</strong>: the instance is being initialized.</li>
         * <li><strong>Init:0/1</strong>: the instance is initializing.</li>
         * <li><strong>Running</strong>: the instance is running.</li>
         * </ol>
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
         * <p>The tag key-value pairs. Valid values:</p>
         * <ul>
         * <li><strong>key</strong>: the tag key. The length must be in the range of [1,128].</li>
         * <li><strong>value</strong>: the tag value. The length must be in the range of [1,128].</li>
         * </ul>
         * <p>Tags are case-sensitive. If you specify multiple tags, all specified tags are created and attached to the resource. Each tag key on the same resource can have only one tag value. If you add a tag key that already exists, the corresponding tag value is updated to the new value.</p>
         * <p>Tags cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
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
