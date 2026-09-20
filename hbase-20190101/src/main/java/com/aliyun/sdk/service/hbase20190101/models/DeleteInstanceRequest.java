// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

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
 * {@link DeleteInstanceRequest} extends {@link RequestModel}
 *
 * <p>DeleteInstanceRequest</p>
 */
public class DeleteInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImmediateDeleteFlag")
    private Boolean immediateDeleteFlag;

    private DeleteInstanceRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.immediateDeleteFlag = builder.immediateDeleteFlag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return immediateDeleteFlag
     */
    public Boolean getImmediateDeleteFlag() {
        return this.immediateDeleteFlag;
    }

    public static final class Builder extends Request.Builder<DeleteInstanceRequest, Builder> {
        private String clusterId; 
        private Boolean immediateDeleteFlag; 

        private Builder() {
            super();
        } 

        private Builder(DeleteInstanceRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.immediateDeleteFlag = request.immediateDeleteFlag;
        } 

        /**
         * <p>The instance ID of the instance to be released.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hb-bp16o0pd52e3y****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>Specifies whether to immediately release the instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The instance is immediately released.</li>
         * <li><strong>false</strong>: The instance is not immediately released and is stored in the recycle bin. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder immediateDeleteFlag(Boolean immediateDeleteFlag) {
            this.putQueryParameter("ImmediateDeleteFlag", immediateDeleteFlag);
            this.immediateDeleteFlag = immediateDeleteFlag;
            return this;
        }

        @Override
        public DeleteInstanceRequest build() {
            return new DeleteInstanceRequest(this);
        } 

    } 

}
