// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

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
 * {@link DeleteInstanceLabelsRequest} extends {@link RequestModel}
 *
 * <p>DeleteInstanceLabelsRequest</p>
 */
public class DeleteInstanceLabelsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LabelKeys")
    @com.aliyun.core.annotation.Validation(required = true)
    private String labelKeys;

    private DeleteInstanceLabelsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.labelKeys = builder.labelKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteInstanceLabelsRequest create() {
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
     * @return labelKeys
     */
    public String getLabelKeys() {
        return this.labelKeys;
    }

    public static final class Builder extends Request.Builder<DeleteInstanceLabelsRequest, Builder> {
        private String instanceId; 
        private String labelKeys; 

        private Builder() {
            super();
        } 

        private Builder(DeleteInstanceLabelsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.labelKeys = request.labelKeys;
        } 

        /**
         * <p>The ID of the DSW instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dsw-730xxxxxxxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The keys of the tags that you want to delete. Separate multiple tags with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>labelKey1,labelKey2,labelKey3</p>
         */
        public Builder labelKeys(String labelKeys) {
            this.putQueryParameter("LabelKeys", labelKeys);
            this.labelKeys = labelKeys;
            return this;
        }

        @Override
        public DeleteInstanceLabelsRequest build() {
            return new DeleteInstanceLabelsRequest(this);
        } 

    } 

}
