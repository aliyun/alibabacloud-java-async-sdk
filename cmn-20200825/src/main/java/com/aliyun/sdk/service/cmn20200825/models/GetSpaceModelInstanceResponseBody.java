// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSpaceModelInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetSpaceModelInstanceResponseBody</p>
 */
public class GetSpaceModelInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SpaceModel")
    private SpaceModel spaceModel;

    private GetSpaceModelInstanceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.spaceModel = builder.spaceModel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSpaceModelInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return spaceModel
     */
    public SpaceModel getSpaceModel() {
        return this.spaceModel;
    }

    public static final class Builder {
        private String requestId; 
        private SpaceModel spaceModel; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SpaceModel.
         */
        public Builder spaceModel(SpaceModel spaceModel) {
            this.spaceModel = spaceModel;
            return this;
        }

        public GetSpaceModelInstanceResponseBody build() {
            return new GetSpaceModelInstanceResponseBody(this);
        } 

    } 

    public static class SpaceModel extends TeaModel {
        @NameInMap("Instance")
        private String instance;

        private SpaceModel(Builder builder) {
            this.instance = builder.instance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpaceModel create() {
            return builder().build();
        }

        /**
         * @return instance
         */
        public String getInstance() {
            return this.instance;
        }

        public static final class Builder {
            private String instance; 

            /**
             * Instance.
             */
            public Builder instance(String instance) {
                this.instance = instance;
                return this;
            }

            public SpaceModel build() {
                return new SpaceModel(this);
            } 

        } 

    }
}
