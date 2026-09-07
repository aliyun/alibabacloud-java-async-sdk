// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20210602.models;

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
 * {@link ListTenantAppRequest} extends {@link RequestModel}
 *
 * <p>ListTenantAppRequest</p>
 */
public class ListTenantAppRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyName")
    private String keyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    private ListTenantAppRequest(Builder builder) {
        super(builder);
        this.keyName = builder.keyName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.sourceType = builder.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTenantAppRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keyName
     */
    public String getKeyName() {
        return this.keyName;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    public static final class Builder extends Request.Builder<ListTenantAppRequest, Builder> {
        private String keyName; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String sourceType; 

        private Builder() {
            super();
        } 

        private Builder(ListTenantAppRequest request) {
            super(request);
            this.keyName = request.keyName;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.sourceType = request.sourceType;
        } 

        /**
         * <p>The application name keyword, matched by containment. If this parameter is not specified or is set to an empty string, no name-based filtering is applied. <code>%</code> can be used as a wildcard, and <code>_</code> is matched as a literal character.</p>
         * 
         * <strong>example:</strong>
         * <p>SampleEditor</p>
         */
        public Builder keyName(String keyName) {
            this.putQueryParameter("KeyName", keyName);
            this.keyName = keyName;
            return this;
        }

        /**
         * <p>The page number, starting from 1. If this parameter is not specified or is set to a value less than or equal to 0, the value 1 is used.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 500. If this parameter is not specified, is set to a value less than or equal to 0, or is set to a value greater than 500, the value 20 is used.</p>
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
         * <p>The application source. Valid values:</p>
         * <ul>
         * <li>MARKET: marketplace applications.</li>
         * <li>TENANT: applications uploaded by the current tenant.</li>
         * </ul>
         * <p>If this parameter is not specified, both types of visible applications are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>TENANT</p>
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        @Override
        public ListTenantAppRequest build() {
            return new ListTenantAppRequest(this);
        } 

    } 

}
