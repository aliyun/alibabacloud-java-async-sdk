// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link ListSessionsOutput} extends {@link TeaModel}
 *
 * <p>ListSessionsOutput</p>
 */
public class ListSessionsOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("sessions")
    private java.util.List<Session> sessions;

    private ListSessionsOutput(Builder builder) {
        this.nextToken = builder.nextToken;
        this.sessions = builder.sessions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSessionsOutput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return sessions
     */
    public java.util.List<Session> getSessions() {
        return this.sessions;
    }

    public static final class Builder {
        private String nextToken; 
        private java.util.List<Session> sessions; 

        private Builder() {
        } 

        private Builder(ListSessionsOutput model) {
            this.nextToken = model.nextToken;
            this.sessions = model.sessions;
        } 

        /**
         * <p>The starting position for the next session list query.</p>
         * 
         * <strong>example:</strong>
         * <p>MTIzNCNhYmM=</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The list of sessions.</p>
         */
        public Builder sessions(java.util.List<Session> sessions) {
            this.sessions = sessions;
            return this;
        }

        public ListSessionsOutput build() {
            return new ListSessionsOutput(this);
        } 

    } 

}
