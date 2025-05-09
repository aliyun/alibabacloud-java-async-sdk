// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link ImportAdminsRequest} extends {@link RequestModel}
 *
 * <p>ImportAdminsRequest</p>
 */
public class ImportAdminsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RamIdList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ramIdList;

    private ImportAdminsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.ramIdList = builder.ramIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportAdminsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return ramIdList
     */
    public String getRamIdList() {
        return this.ramIdList;
    }

    public static final class Builder extends Request.Builder<ImportAdminsRequest, Builder> {
        private String instanceId; 
        private String ramIdList; 

        private Builder() {
            super();
        } 

        private Builder(ImportAdminsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.ramIdList = request.ramIdList;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;26972543893791****&quot;]</p>
         */
        public Builder ramIdList(String ramIdList) {
            this.putQueryParameter("RamIdList", ramIdList);
            this.ramIdList = ramIdList;
            return this;
        }

        @Override
        public ImportAdminsRequest build() {
            return new ImportAdminsRequest(this);
        } 

    } 

}
