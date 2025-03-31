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
 * {@link ListAsyncTaskOutput} extends {@link TeaModel}
 *
 * <p>ListAsyncTaskOutput</p>
 */
public class ListAsyncTaskOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("tasks")
    private java.util.List<AsyncTask> tasks;

    private ListAsyncTaskOutput(Builder builder) {
        this.nextToken = builder.nextToken;
        this.tasks = builder.tasks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAsyncTaskOutput create() {
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
     * @return tasks
     */
    public java.util.List<AsyncTask> getTasks() {
        return this.tasks;
    }

    public static final class Builder {
        private String nextToken; 
        private java.util.List<AsyncTask> tasks; 

        private Builder() {
        } 

        private Builder(ListAsyncTaskOutput model) {
            this.nextToken = model.nextToken;
            this.tasks = model.tasks;
        } 

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * tasks.
         */
        public Builder tasks(java.util.List<AsyncTask> tasks) {
            this.tasks = tasks;
            return this;
        }

        public ListAsyncTaskOutput build() {
            return new ListAsyncTaskOutput(this);
        } 

    } 

}
