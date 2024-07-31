// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCommandRequest} extends {@link RequestModel}
 *
 * <p>DeleteCommandRequest</p>
 */
public class DeleteCommandRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommandId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String commandId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DeleteCommandRequest(Builder builder) {
        super(builder);
        this.commandId = builder.commandId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCommandRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return commandId
     */
    public String getCommandId() {
        return this.commandId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteCommandRequest, Builder> {
        private String commandId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCommandRequest request) {
            super(request);
            this.commandId = request.commandId;
            this.regionId = request.regionId;
        } 

        /**
         * The command ID. You can call the [DescribeCommands](~~64843~~) operation to query all available command IDs.
         */
        public Builder commandId(String commandId) {
            this.putQueryParameter("CommandId", commandId);
            this.commandId = commandId;
            return this;
        }

        /**
         * The region ID. You can call the [ListRegions](~~189315~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteCommandRequest build() {
            return new DeleteCommandRequest(this);
        } 

    } 

}
