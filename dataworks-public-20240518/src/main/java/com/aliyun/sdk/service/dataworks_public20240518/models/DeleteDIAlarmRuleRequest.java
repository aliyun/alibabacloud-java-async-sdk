// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link DeleteDIAlarmRuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteDIAlarmRuleRequest</p>
 */
public class DeleteDIAlarmRuleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DIAlarmRuleId")
    @Deprecated
    private Long DIAlarmRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DIJobId")
    private Long DIJobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    private DeleteDIAlarmRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.DIAlarmRuleId = builder.DIAlarmRuleId;
        this.DIJobId = builder.DIJobId;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDIAlarmRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return DIAlarmRuleId
     */
    public Long getDIAlarmRuleId() {
        return this.DIAlarmRuleId;
    }

    /**
     * @return DIJobId
     */
    public Long getDIJobId() {
        return this.DIJobId;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<DeleteDIAlarmRuleRequest, Builder> {
        private String regionId; 
        private Long DIAlarmRuleId; 
        private Long DIJobId; 
        private Long id; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDIAlarmRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.DIAlarmRuleId = request.DIAlarmRuleId;
            this.DIJobId = request.DIJobId;
            this.id = request.id;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is deprecated. Use the Id parameter instead.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder DIAlarmRuleId(Long DIAlarmRuleId) {
            this.putQueryParameter("DIAlarmRuleId", DIAlarmRuleId);
            this.DIAlarmRuleId = DIAlarmRuleId;
            return this;
        }

        /**
         * <p>The ID of the synchronization task.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder DIJobId(Long DIJobId) {
            this.putQueryParameter("DIJobId", DIJobId);
            this.DIJobId = DIJobId;
            return this;
        }

        /**
         * <p>The ID of the synchronization task.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public DeleteDIAlarmRuleRequest build() {
            return new DeleteDIAlarmRuleRequest(this);
        } 

    } 

}
