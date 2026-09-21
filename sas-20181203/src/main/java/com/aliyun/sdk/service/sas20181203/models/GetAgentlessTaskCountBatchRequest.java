// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetAgentlessTaskCountBatchRequest} extends {@link RequestModel}
 *
 * <p>GetAgentlessTaskCountBatchRequest</p>
 */
public class GetAgentlessTaskCountBatchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetType")
    private Integer targetType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UuidList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> uuidList;

    private GetAgentlessTaskCountBatchRequest(Builder builder) {
        super(builder);
        this.targetType = builder.targetType;
        this.uuidList = builder.uuidList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentlessTaskCountBatchRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return targetType
     */
    public Integer getTargetType() {
        return this.targetType;
    }

    /**
     * @return uuidList
     */
    public java.util.List<String> getUuidList() {
        return this.uuidList;
    }

    public static final class Builder extends Request.Builder<GetAgentlessTaskCountBatchRequest, Builder> {
        private Integer targetType; 
        private java.util.List<String> uuidList; 

        private Builder() {
            super();
        } 

        private Builder(GetAgentlessTaskCountBatchRequest request) {
            super(request);
            this.targetType = request.targetType;
            this.uuidList = request.uuidList;
        } 

        /**
         * <p>The detection object type. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: host snapshot</li>
         * <li><strong>2</strong>: host image</li>
         * <li><strong>3</strong>: user snapshot</li>
         * <li><strong>4</strong>: user image</li>
         * <li><strong>5</strong>: NAS file system</li>
         * <li><strong>6</strong>: parallel sandbox</li>
         * <li><strong>7</strong>: security fix</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder targetType(Integer targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        /**
         * <p>The list of resource UUIDs to query. The list can contain 1 to 100 elements.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;3bb30859-b3b5-4f28-868f-b0892c98****&quot;]</p>
         */
        public Builder uuidList(java.util.List<String> uuidList) {
            this.putBodyParameter("UuidList", uuidList);
            this.uuidList = uuidList;
            return this;
        }

        @Override
        public GetAgentlessTaskCountBatchRequest build() {
            return new GetAgentlessTaskCountBatchRequest(this);
        } 

    } 

}
