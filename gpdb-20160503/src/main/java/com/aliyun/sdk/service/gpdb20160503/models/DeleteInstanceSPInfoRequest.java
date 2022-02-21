// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteInstanceSPInfoRequest} extends {@link RequestModel}
 *
 * <p>DeleteInstanceSPInfoRequest</p>
 */
public class DeleteInstanceSPInfoRequest extends Request {
    @Query
    @NameInMap("DBInstanceId")
    private String DBInstanceId;

    @Query
    @NameInMap("DBInstanceInfos")
    private String DBInstanceInfos;

    private DeleteInstanceSPInfoRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.DBInstanceInfos = builder.DBInstanceInfos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteInstanceSPInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return DBInstanceInfos
     */
    public String getDBInstanceInfos() {
        return this.DBInstanceInfos;
    }

    public static final class Builder extends Request.Builder<DeleteInstanceSPInfoRequest, Builder> {
        private String DBInstanceId; 
        private String DBInstanceInfos; 

        private Builder() {
            super();
        } 

        private Builder(DeleteInstanceSPInfoRequest response) {
            super(response);
            this.DBInstanceId = response.DBInstanceId;
            this.DBInstanceInfos = response.DBInstanceInfos;
        } 

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * DBInstanceInfos.
         */
        public Builder DBInstanceInfos(String DBInstanceInfos) {
            this.putQueryParameter("DBInstanceInfos", DBInstanceInfos);
            this.DBInstanceInfos = DBInstanceInfos;
            return this;
        }

        @Override
        public DeleteInstanceSPInfoRequest build() {
            return new DeleteInstanceSPInfoRequest(this);
        } 

    } 

}
