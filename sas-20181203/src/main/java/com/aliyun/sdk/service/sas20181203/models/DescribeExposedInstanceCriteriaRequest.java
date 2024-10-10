// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeExposedInstanceCriteriaRequest} extends {@link RequestModel}
 *
 * <p>DescribeExposedInstanceCriteriaRequest</p>
 */
public class DescribeExposedInstanceCriteriaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private String resourceDirectoryAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Value")
    private String value;

    private DescribeExposedInstanceCriteriaRequest(Builder builder) {
        super(builder);
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExposedInstanceCriteriaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceDirectoryAccountId
     */
    public String getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder extends Request.Builder<DescribeExposedInstanceCriteriaRequest, Builder> {
        private String resourceDirectoryAccountId; 
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(DescribeExposedInstanceCriteriaRequest request) {
            super(request);
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.value = request.value;
        } 

        /**
         * <p>The ID of the member in the resource directory.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to query the account ID.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1232428423234****</p>
         */
        public Builder resourceDirectoryAccountId(String resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * <p>The value of the search condition. Fuzzy match is supported.</p>
         * <blockquote>
         * <p> You can specify the name, ID, public IP address, private IP address, component, port, or IP address of an exposed asset.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>id</p>
         */
        public Builder value(String value) {
            this.putQueryParameter("Value", value);
            this.value = value;
            return this;
        }

        @Override
        public DescribeExposedInstanceCriteriaRequest build() {
            return new DescribeExposedInstanceCriteriaRequest(this);
        } 

    } 

}
