// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchplat20240401.models;

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
 * {@link ListExperienceDataRequest} extends {@link RequestModel}
 *
 * <p>ListExperienceDataRequest</p>
 */
public class ListExperienceDataRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dataType")
    private String dataType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("serviceType")
    private String serviceType;

    private ListExperienceDataRequest(Builder builder) {
        super(builder);
        this.workspaceName = builder.workspaceName;
        this.dataType = builder.dataType;
        this.dryRun = builder.dryRun;
        this.serviceType = builder.serviceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExperienceDataRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    /**
     * @return dataType
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return serviceType
     */
    public String getServiceType() {
        return this.serviceType;
    }

    public static final class Builder extends Request.Builder<ListExperienceDataRequest, Builder> {
        private String workspaceName; 
        private String dataType; 
        private Boolean dryRun; 
        private String serviceType; 

        private Builder() {
            super();
        } 

        private Builder(ListExperienceDataRequest request) {
            super(request);
            this.workspaceName = request.workspaceName;
            this.dataType = request.dataType;
            this.dryRun = request.dryRun;
            this.serviceType = request.serviceType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder workspaceName(String workspaceName) {
            this.putPathParameter("workspaceName", workspaceName);
            this.workspaceName = workspaceName;
            return this;
        }

        /**
         * dataType.
         */
        public Builder dataType(String dataType) {
            this.putQueryParameter("dataType", dataType);
            this.dataType = dataType;
            return this;
        }

        /**
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("dryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * serviceType.
         */
        public Builder serviceType(String serviceType) {
            this.putQueryParameter("serviceType", serviceType);
            this.serviceType = serviceType;
            return this;
        }

        @Override
        public ListExperienceDataRequest build() {
            return new ListExperienceDataRequest(this);
        } 

    } 

}
