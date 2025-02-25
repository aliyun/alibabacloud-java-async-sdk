// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20230522.models;

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
 * {@link CreateDBRequest} extends {@link RequestModel}
 *
 * <p>CreateDBRequest</p>
 */
public class CreateDBRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private CreateDBRequest(Builder builder) {
        super(builder);
        this.comment = builder.comment;
        this.DBInstanceId = builder.DBInstanceId;
        this.DBName = builder.DBName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDBRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return DBName
     */
    public String getDBName() {
        return this.DBName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateDBRequest, Builder> {
        private String comment; 
        private String DBInstanceId; 
        private String DBName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDBRequest request) {
            super(request);
            this.comment = request.comment;
            this.DBInstanceId = request.DBInstanceId;
            this.DBName = request.DBName;
            this.regionId = request.regionId;
        } 

        /**
         * Comment.
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cc-bp100p4q1g9z3****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The name of the database. The name must meet the following requirements:</p>
         * <ul>
         * <li>The name can contain lowercase letters, digits, underscores (_), and hyphens (-).</li>
         * <li>The name must start with a lowercase letter and end with a lowercase letter or a digit.</li>
         * <li>The name can be up to 64 characters in length.</li>
         * </ul>
         * <blockquote>
         * <p> An underscore (_) is counted as two characters.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testdb001</p>
         */
        public Builder DBName(String DBName) {
            this.putQueryParameter("DBName", DBName);
            this.DBName = DBName;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateDBRequest build() {
            return new CreateDBRequest(this);
        } 

    } 

}
