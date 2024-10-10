// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateFileProtectEventStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateFileProtectEventStatusRequest</p>
 */
public class UpdateFileProtectEventStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private java.util.List < Long > id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    private UpdateFileProtectEventStatusRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFileProtectEventStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public java.util.List < Long > getId() {
        return this.id;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<UpdateFileProtectEventStatusRequest, Builder> {
        private java.util.List < Long > id; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFileProtectEventStatusRequest request) {
            super(request);
            this.id = request.id;
            this.status = request.status;
        } 

        /**
         * <p>The IDs of the events.</p>
         */
        public Builder id(java.util.List < Long > id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The handling status of the event. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: unhandled</li>
         * <li><strong>1</strong>: handled</li>
         * <li><strong>2</strong>: added to the whitelist</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public UpdateFileProtectEventStatusRequest build() {
            return new UpdateFileProtectEventStatusRequest(this);
        } 

    } 

}
