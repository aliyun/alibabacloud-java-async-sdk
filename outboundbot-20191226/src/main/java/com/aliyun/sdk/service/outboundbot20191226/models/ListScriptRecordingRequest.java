// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListScriptRecordingRequest} extends {@link RequestModel}
 *
 * <p>ListScriptRecordingRequest</p>
 */
public class ListScriptRecordingRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("PageNumber")
    @Validation(required = true)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Query
    @NameInMap("ScriptId")
    @Validation(required = true)
    private String scriptId;

    @Query
    @NameInMap("Search")
    private String search;

    @Query
    @NameInMap("StatesJson")
    private String statesJson;

    @Query
    @NameInMap("UuidsJson")
    private String uuidsJson;

    private ListScriptRecordingRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.scriptId = builder.scriptId;
        this.search = builder.search;
        this.statesJson = builder.statesJson;
        this.uuidsJson = builder.uuidsJson;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListScriptRecordingRequest create() {
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return scriptId
     */
    public String getScriptId() {
        return this.scriptId;
    }

    /**
     * @return search
     */
    public String getSearch() {
        return this.search;
    }

    /**
     * @return statesJson
     */
    public String getStatesJson() {
        return this.statesJson;
    }

    /**
     * @return uuidsJson
     */
    public String getUuidsJson() {
        return this.uuidsJson;
    }

    public static final class Builder extends Request.Builder<ListScriptRecordingRequest, Builder> {
        private String instanceId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String scriptId; 
        private String search; 
        private String statesJson; 
        private String uuidsJson; 

        private Builder() {
            super();
        } 

        private Builder(ListScriptRecordingRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.scriptId = request.scriptId;
            this.search = request.search;
            this.statesJson = request.statesJson;
            this.uuidsJson = request.uuidsJson;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ScriptId.
         */
        public Builder scriptId(String scriptId) {
            this.putQueryParameter("ScriptId", scriptId);
            this.scriptId = scriptId;
            return this;
        }

        /**
         * Search.
         */
        public Builder search(String search) {
            this.putQueryParameter("Search", search);
            this.search = search;
            return this;
        }

        /**
         * StatesJson.
         */
        public Builder statesJson(String statesJson) {
            this.putQueryParameter("StatesJson", statesJson);
            this.statesJson = statesJson;
            return this;
        }

        /**
         * UuidsJson.
         */
        public Builder uuidsJson(String uuidsJson) {
            this.putQueryParameter("UuidsJson", uuidsJson);
            this.uuidsJson = uuidsJson;
            return this;
        }

        @Override
        public ListScriptRecordingRequest build() {
            return new ListScriptRecordingRequest(this);
        } 

    } 

}
