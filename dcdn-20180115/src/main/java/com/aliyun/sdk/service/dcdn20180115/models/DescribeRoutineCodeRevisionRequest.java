// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRoutineCodeRevisionRequest} extends {@link RequestModel}
 *
 * <p>DescribeRoutineCodeRevisionRequest</p>
 */
public class DescribeRoutineCodeRevisionRequest extends Request {
    @Body
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Body
    @NameInMap("SelectCodeRevision")
    @Validation(required = true)
    private String selectCodeRevision;

    private DescribeRoutineCodeRevisionRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.ownerId = builder.ownerId;
        this.selectCodeRevision = builder.selectCodeRevision;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRoutineCodeRevisionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return selectCodeRevision
     */
    public String getSelectCodeRevision() {
        return this.selectCodeRevision;
    }

    public static final class Builder extends Request.Builder<DescribeRoutineCodeRevisionRequest, Builder> {
        private String name; 
        private Long ownerId; 
        private String selectCodeRevision; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRoutineCodeRevisionRequest response) {
            super(response);
            this.name = response.name;
            this.ownerId = response.ownerId;
            this.selectCodeRevision = response.selectCodeRevision;
        } 

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * SelectCodeRevision.
         */
        public Builder selectCodeRevision(String selectCodeRevision) {
            this.putBodyParameter("SelectCodeRevision", selectCodeRevision);
            this.selectCodeRevision = selectCodeRevision;
            return this;
        }

        @Override
        public DescribeRoutineCodeRevisionRequest build() {
            return new DescribeRoutineCodeRevisionRequest(this);
        } 

    } 

}
