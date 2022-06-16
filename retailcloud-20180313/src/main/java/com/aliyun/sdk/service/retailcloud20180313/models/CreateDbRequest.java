// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDbRequest} extends {@link RequestModel}
 *
 * <p>CreateDbRequest</p>
 */
public class CreateDbRequest extends Request {
    @Body
    @NameInMap("CharacterSetName")
    @Validation(required = true)
    private String characterSetName;

    @Body
    @NameInMap("DbDescription")
    private String dbDescription;

    @Body
    @NameInMap("DbInstanceId")
    @Validation(required = true)
    private String dbInstanceId;

    @Body
    @NameInMap("DbName")
    @Validation(required = true)
    private String dbName;

    private CreateDbRequest(Builder builder) {
        super(builder);
        this.characterSetName = builder.characterSetName;
        this.dbDescription = builder.dbDescription;
        this.dbInstanceId = builder.dbInstanceId;
        this.dbName = builder.dbName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDbRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return characterSetName
     */
    public String getCharacterSetName() {
        return this.characterSetName;
    }

    /**
     * @return dbDescription
     */
    public String getDbDescription() {
        return this.dbDescription;
    }

    /**
     * @return dbInstanceId
     */
    public String getDbInstanceId() {
        return this.dbInstanceId;
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    public static final class Builder extends Request.Builder<CreateDbRequest, Builder> {
        private String characterSetName; 
        private String dbDescription; 
        private String dbInstanceId; 
        private String dbName; 

        private Builder() {
            super();
        } 

        private Builder(CreateDbRequest request) {
            super(request);
            this.characterSetName = request.characterSetName;
            this.dbDescription = request.dbDescription;
            this.dbInstanceId = request.dbInstanceId;
            this.dbName = request.dbName;
        } 

        /**
         * CharacterSetName.
         */
        public Builder characterSetName(String characterSetName) {
            this.putBodyParameter("CharacterSetName", characterSetName);
            this.characterSetName = characterSetName;
            return this;
        }

        /**
         * DbDescription.
         */
        public Builder dbDescription(String dbDescription) {
            this.putBodyParameter("DbDescription", dbDescription);
            this.dbDescription = dbDescription;
            return this;
        }

        /**
         * DbInstanceId.
         */
        public Builder dbInstanceId(String dbInstanceId) {
            this.putBodyParameter("DbInstanceId", dbInstanceId);
            this.dbInstanceId = dbInstanceId;
            return this;
        }

        /**
         * DbName.
         */
        public Builder dbName(String dbName) {
            this.putBodyParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        @Override
        public CreateDbRequest build() {
            return new CreateDbRequest(this);
        } 

    } 

}
